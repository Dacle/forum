package com.forum.bean;

import java.io.Serializable;
import java.math.BigDecimal;

/** @author Hibernate CodeGenerator */
public class Mainboard implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** identifier field */
    private BigDecimal mboardid;

    /** persistent field */
    private String mboardname;

    /** nullable persistent field */
    private BigDecimal stateid;

    /** persistent field */
    private BigDecimal user;

    /** full constructor */
    public Mainboard(BigDecimal mboardid, String mboardname, BigDecimal stateid, BigDecimal user) {
        this.mboardid = mboardid;
        this.mboardname = mboardname;
        this.stateid = stateid;
        this.user = user;
    }

    /** default constructor */
    public Mainboard() {
    }

    /** minimal constructor */
    public Mainboard(BigDecimal mboardid, String mboardname, BigDecimal user) {
        this.mboardid = mboardid;
        this.mboardname = mboardname;
        this.user = user;
    }

    public BigDecimal getMboardid() {
        return this.mboardid;
    }

    public void setMboardid(BigDecimal mboardid) {
        this.mboardid = mboardid;
    }

    public String getMboardname() {
        return this.mboardname;
    }

    public void setMboardname(String mboardname) {
        this.mboardname = mboardname;
    }

    public BigDecimal getStateid() {
        return this.stateid;
    }

    public void setStateid(BigDecimal stateid) {
        this.stateid = stateid;
    }

    public BigDecimal getUser() {
        return this.user;
    }

    public void setUser(BigDecimal user) {
        this.user = user;
    }
}
