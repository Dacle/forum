package com.forum.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Set;
import org.apache.commons.lang.builder.ToStringBuilder;


/** @author Hibernate CodeGenerator */
public class Managetype implements Serializable {

    /** identifier field */
    private BigDecimal managetypeid;

    /** persistent field */
    private String typename;

    /** persistent field */
    private Set managerecords;

    /** full constructor */
    public Managetype(BigDecimal managetypeid, String typename, Set managerecords) {
        this.managetypeid = managetypeid;
        this.typename = typename;
        this.managerecords = managerecords;
    }

    /** default constructor */
    public Managetype() {
    }

    public BigDecimal getManagetypeid() {
        return this.managetypeid;
    }

    public void setManagetypeid(BigDecimal managetypeid) {
        this.managetypeid = managetypeid;
    }

    public String getTypename() {
        return this.typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    public Set getManagerecords() {
        return this.managerecords;
    }

    public void setManagerecords(Set managerecords) {
        this.managerecords = managerecords;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("managetypeid", getManagetypeid())
            .toString();
    }

}
