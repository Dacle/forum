package com.forum.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import org.apache.commons.lang.builder.ToStringBuilder;


/** @author Hibernate CodeGenerator */
public class Usertyperequest implements Serializable {

    /** identifier field */
    private BigDecimal userid;

    /** nullable persistent field */
    private BigDecimal usertypeid;

    /** nullable persistent field */
    private String reason;

    /** nullable persistent field */
    private com.forum.bean.User user;

    /** full constructor */
    public Usertyperequest(BigDecimal userid, BigDecimal usertypeid, String reason, com.forum.bean.User user) {
        this.userid = userid;
        this.usertypeid = usertypeid;
        this.reason = reason;
        this.user = user;
    }

    /** default constructor */
    public Usertyperequest() {
    }

    /** minimal constructor */
    public Usertyperequest(BigDecimal userid) {
        this.userid = userid;
    }

    public BigDecimal getUserid() {
        return this.userid;
    }

    public void setUserid(BigDecimal userid) {
        this.userid = userid;
    }

    public BigDecimal getUsertypeid() {
        return this.usertypeid;
    }

    public void setUsertypeid(BigDecimal usertypeid) {
        this.usertypeid = usertypeid;
    }

    public String getReason() {
        return this.reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public com.forum.bean.User getUser() {
        return this.user;
    }

    public void setUser(com.forum.bean.User user) {
        this.user = user;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("userid", getUserid())
            .toString();
    }

}
