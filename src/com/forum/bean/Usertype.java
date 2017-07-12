package com.forum.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import org.apache.commons.lang.builder.ToStringBuilder;


/** @author Hibernate CodeGenerator */
public class Usertype implements Serializable {

    /** identifier field */
    private BigDecimal typeid;

    /** persistent field */
    private String typename;

    /** full constructor */
    public Usertype(BigDecimal typeid, String typename) {
        this.typeid = typeid;
        this.typename = typename;
    }

    /** default constructor */
    public Usertype() {
    }

    public BigDecimal getTypeid() {
        return this.typeid;
    }

    public void setTypeid(BigDecimal typeid) {
        this.typeid = typeid;
    }

    public String getTypename() {
        return this.typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("typeid", getTypeid())
            .toString();
    }

}
