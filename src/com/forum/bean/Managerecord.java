package com.forum.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import org.apache.commons.lang.builder.ToStringBuilder;


/** @author Hibernate CodeGenerator */
public class Managerecord implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** identifier field */
    private BigDecimal managerecordid;

    /** nullable persistent field */
    private BigDecimal bemanageduserid;

    /** persistent field */
    private String describe;

    /** persistent field */
    private BigDecimal managerid;

    /** persistent field */
    private BigDecimal managetype;

    /** persistent field */
    private BigDecimal basicboard;

    /** persistent field */
    private BigDecimal post;

    /** full constructor */
    public Managerecord(BigDecimal managerecordid, BigDecimal bemanageduserid, String describe, BigDecimal user, BigDecimal managetype, BigDecimal basicboard, BigDecimal post) {
        this.managerecordid = managerecordid;
        this.bemanageduserid = bemanageduserid;
        this.describe = describe;
        this.managerid = user;
        this.managetype = managetype;
        this.basicboard = basicboard;
        this.post = post;
    }

    /** default constructor */
    public Managerecord() {
    }

    /** minimal constructor */
    public Managerecord(BigDecimal managerecordid, String describe, BigDecimal user, BigDecimal managetype, BigDecimal basicboard, BigDecimal post) {
        this.managerecordid = managerecordid;
        this.describe = describe;
        this.managerid = user;
        this.managetype = managetype;
        this.basicboard = basicboard;
        this.post = post;
    }

    public BigDecimal getManagerecordid() {
        return this.managerecordid;
    }

    public void setManagerecordid(BigDecimal managerecordid) {
        this.managerecordid = managerecordid;
    }

    public BigDecimal getBemanageduserid() {
        return this.bemanageduserid;
    }

    public void setBemanageduserid(BigDecimal bemanageduserid) {
        this.bemanageduserid = bemanageduserid;
    }

    public String getDescribe() {
        return this.describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public BigDecimal getUser() {
        return this.managerid;
    }

    public void setUser(BigDecimal user) {
        this.managerid = user;
    }

    public BigDecimal getManagetype() {
        return this.managetype;
    }

    public void setManagetype(BigDecimal managetype) {
        this.managetype = managetype;
    }

    public BigDecimal getBasicboard() {
        return this.basicboard;
    }

    public void setBasicboard(BigDecimal basicboard) {
        this.basicboard = basicboard;
    }

    public BigDecimal getPost() {
        return this.post;
    }

    public void setPost(BigDecimal post) {
        this.post = post;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("managerecordid", getManagerecordid())
            .toString();
    }

}
