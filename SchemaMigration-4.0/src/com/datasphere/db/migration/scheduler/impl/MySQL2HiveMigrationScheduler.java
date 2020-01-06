package com.datasphere.db.migration.scheduler.impl;


import java.util.Collection;

import com.datasphere.db.dao.IBaseDao;
import com.datasphere.db.dao.impl.HiveDao;
import com.datasphere.db.dao.impl.MySQLDao;
import com.datasphere.db.entity.Column;
import com.datasphere.db.exception.ColumnTypeUnsurported;
import com.datasphere.db.migration.scheduler.AbstractMigrationScheduler;

public class MySQL2HiveMigrationScheduler extends AbstractMigrationScheduler {
	
//	public static int DEFAULT_VARCHAR_LENGTH = 500;
	public static int HIVE_CHAR_MAX_LENGTH = 254;
	public static int HIVE_NUMERIC_MAX_PRECISION = 127;
	public final static String TYPE_TIMESTAMP = "TIMESTAMP";
	public final static String TYPE_TIME_ZONE = "WITH TIME ZONE";
	public final static String TYPE_LOCAL_TIME_ZONE = "WITH LOCAL TIME ZONE";
	
	@Override
	public Column convert(Column column) {
		Column newColumn = super.convert(column);
		String columnType = column.getType();
		columnType = column.getType().startsWith(TYPE_TIMESTAMP) ? TYPE_TIMESTAMP : columnType;
		String type = columnType.toLowerCase().substring(0,columnType.indexOf("(")>-1?columnType.indexOf("("):columnType.length());
		switch (type) {
		
			// 处理二进制类型
			case "binary":
			case "varbinary":
				newColumn.setType("binary");
				break;	
			// 处理布尔类型
			case "boolean":
			case "bit":
				newColumn.setType("boolean");
				break;
			// 处理集合类型
			case "enum":
			case "set":
				newColumn.setType("struct");
				break;
			
			//处理字符类型
			case "char":
			case "nchar":
			case "nvarchar2":
			case "varchar":
			case "tinyblob":
			case "tinytext":
			case "blob":
			case "text":
			case "mediumblob":
			case "mediumtext":
			case "longblob":
			case "longtext":
			case "json":
				
				newColumn.setType("string");
				break;
			//处理数值类型
			case "tinyint":
				newColumn.setType("tinyint");
				break;
			case "smallint":
				newColumn.setType("smallint");
				break;
			case "int":
				newColumn.setType("int");
				break;
			case "bigint":
				newColumn.setType("bitint");
				break;
			
			case "float":
				newColumn.setPrecision(newColumn.getPrecision());
				newColumn.setScale(newColumn.getScale());
				newColumn.setType("float");
				break;
			
			case "double":
				newColumn.setPrecision(newColumn.getPrecision());
				newColumn.setScale(newColumn.getScale());
				newColumn.setType("double");
				break;
			
			case "decimal":
				if(column.getLength() > HIVE_NUMERIC_MAX_PRECISION) {
					throw new ColumnTypeUnsurported("The length of decimal exceeds!column=" + column.getName() + ",table=" + column.getTableName());
				}
                if((column.getPrecision()==null || column.getPrecision() == 0)){
                		newColumn.setPrecision(HIVE_NUMERIC_MAX_PRECISION);
                	if(column.getScale()==null || column.getScale()==0){
                		newColumn.setScale(4);
                	}
				}else{
					newColumn.setPrecision(column.getPrecision());
					newColumn.setScale(column.getScale());
				}
                	newColumn.setType("decimal");
				break;
			
			case "date":
				newColumn.setType("date");
				break;
			case "time":
			case "timestamp":
			case "datetime":
					
				newColumn.setType("timestamp");
				break;
			default: {
				//不支持的类型 INTERVAL DAY,INTERVAL YEAR ROWID UROWID BFILE 
				throw new ColumnTypeUnsurported("Unsurport Type ["+columnType.toUpperCase()+"]");
			}	
		}

		return newColumn;
	}

	@Override
	public IBaseDao createSourceDao() {
		MySQLDao mysqlDao = new MySQLDao();
		mysqlDao.setConfig(this.getMigration().getSourceConfig());
		return mysqlDao;
	}

	@Override
	public IBaseDao createDestDao() {
		HiveDao hiveDao = new HiveDao();
		hiveDao.setConfig(this.getMigration().getDestConfig());
		return hiveDao;
	}

	@Override
	public void convert(Collection<Column> srcColumns, Collection<Column> destColumns, Object[][] data) {}
}