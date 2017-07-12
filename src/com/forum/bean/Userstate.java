package com.forum.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Set;
import org.apache.commons.lang.builder.ToStringBuilder;


/** @author Hibernate CodeGenerator */
public class Userstate implements Serializable {

    /** identifier field */
    private BigDecimal stateid;

    /** persistent field */
    private String state;

    /** persistent field */
    private Set basicboards;

    /** full constructor */
    public Userstate(BigDecimal stateid, String state, Set basicboards) {
        this.stateid = stateid;
        this.state = state;
        this.basicboards = basicboards;
    }

    /** default constructor */
    public Userstate() {
    }

    public BigDecimal getStateid() {
        return this.stateid;
    }

    public void setStateid(BigDecimal stateid) {
        this.stateid = stateid;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Set getBasicboards() {
        return this.basicboards;
    }

    public void setBasicboards(Set basicboards) {
        this.basicboards = basicboards;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("stateid", getStateid())
            .toString();
    }

}
