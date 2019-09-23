package org.eclipse.eclipselink.xsds.persistence.orm;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "column")
public class Column
{
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "unique")
    protected Boolean unique;
    @XmlAttribute(name = "nullable")
    protected Boolean nullable;
    @XmlAttribute(name = "insertable")
    protected Boolean insertable;
    @XmlAttribute(name = "updatable")
    protected Boolean updatable;
    @XmlAttribute(name = "column-definition")
    protected String columnDefinition;
    @XmlAttribute(name = "table")
    protected String table;
    @XmlAttribute(name = "length")
    protected Integer length;
    @XmlAttribute(name = "precision")
    protected Integer precision;
    @XmlAttribute(name = "scale")
    protected Integer scale;
    
    public String getName() {
        return this.name;
    }
    
    public void setName(final String value) {
        this.name = value;
    }
    
    public Boolean isUnique() {
        return this.unique;
    }
    
    public void setUnique(final Boolean value) {
        this.unique = value;
    }
    
    public Boolean isNullable() {
        return this.nullable;
    }
    
    public void setNullable(final Boolean value) {
        this.nullable = value;
    }
    
    public Boolean isInsertable() {
        return this.insertable;
    }
    
    public void setInsertable(final Boolean value) {
        this.insertable = value;
    }
    
    public Boolean isUpdatable() {
        return this.updatable;
    }
    
    public void setUpdatable(final Boolean value) {
        this.updatable = value;
    }
    
    public String getColumnDefinition() {
        return this.columnDefinition;
    }
    
    public void setColumnDefinition(final String value) {
        this.columnDefinition = value;
    }
    
    public String getTable() {
        return this.table;
    }
    
    public void setTable(final String value) {
        this.table = value;
    }
    
    public Integer getLength() {
        return this.length;
    }
    
    public void setLength(final Integer value) {
        this.length = value;
    }
    
    public Integer getPrecision() {
        return this.precision;
    }
    
    public void setPrecision(final Integer value) {
        this.precision = value;
    }
    
    public Integer getScale() {
        return this.scale;
    }
    
    public void setScale(final Integer value) {
        this.scale = value;
    }
}
