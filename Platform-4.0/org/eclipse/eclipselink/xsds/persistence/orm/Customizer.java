package org.eclipse.eclipselink.xsds.persistence.orm;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "customizer")
public class Customizer
{
    @XmlAttribute(name = "class", required = true)
    protected String clazz;
    
    public String getClazz() {
        return this.clazz;
    }
    
    public void setClazz(final String value) {
        this.clazz = value;
    }
}
