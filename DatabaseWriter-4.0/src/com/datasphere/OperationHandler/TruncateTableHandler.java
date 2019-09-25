package com.datasphere.OperationHandler;

import com.datasphere.exception.*;
import com.datasphere.intf.*;
import com.datasphere.proc.events.*;
import com.datasphere.common.constants.*;
import gudusoft.gsqlparser.stmt.*;
import gudusoft.gsqlparser.nodes.*;
import java.sql.*;

public class TruncateTableHandler extends DDLHandler
{
    public TruncateTableHandler(final DBInterface intf) {
        super(intf);
    }
    
    @Override
    public String generateDDL(final HDEvent event, final String targetTable) throws SQLException, DatabaseWriterException {
        String ddlCmd = (String)event.data[0];
        this.sqlParser.sqltext = ddlCmd;
        final String catalog = (String)event.metadata.get(Constant.CATALOG_NAME);
        final String schema = (String)event.metadata.get(Constant.SCHEMA_NAME);
        final int ret = this.sqlParser.parse();
        if (ret == 0) {
            final TTruncateStatement truncateStmt = (TTruncateStatement)this.sqlParser.sqlstatements.get(0);
            final TTableList tables = truncateStmt.tables;
            for (int itr = 0; itr < tables.size(); ++itr) {
                final TTable t = tables.getTable(itr);
                final TObjectName oName = t.getTableName();
                final MappedName mappedTableName = this.getMappedName(catalog, schema, oName);
                mappedTableName.update(oName);
            }
            ddlCmd = truncateStmt.toString();
            return ddlCmd;
        }
        final String errMsg = "Error while replacing table name {" + this.sqlParser.getErrormessage() + "}";
        throw new DatabaseWriterException(errMsg);
    }
    
    class SecurityAccess {
		public void disopen() {

		}
	}
}
