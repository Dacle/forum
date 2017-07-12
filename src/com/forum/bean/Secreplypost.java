package com.forum.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import org.apache.commons.lang.builder.ToStringBuilder;


/** @author Hibernate CodeGenerator */
public class Secreplypost implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** identifier field */
    private BigDecimal secreplypostid;

    /** persistent field */
    private String replycontent;

    /** persistent field */
    private Date replytime;

    /** nullable persistent field */
    private BigDecimal secid;

    /** persistent field */
    private BigDecimal user;

    /** persistent field */
    private BigDecimal replypost;

    /** full constructor */
    public Secreplypost(BigDecimal secreplypostid, String replycontent, Date replytime, BigDecimal secid, BigDecimal user, BigDecimal replypost) {
        this.secreplypostid = secreplypostid;
        this.replycontent = replycontent;
        this.replytime = replytime;
        this.secid = secid;
        this.user = user;
        this.replypost = replypost;
    }

    /** default constructor */
    public Secreplypost() {
    }

    /** minimal constructor */
    public Secreplypost(BigDecimal secreplypostid, String replycontent, Date replytime, BigDecimal user, BigDecimal replypost) {
        this.secreplypostid = secreplypostid;
        this.replycontent = replycontent;
        this.replytime = replytime;
        this.user = user;
        this.replypost = replypost;
    }

    public BigDecimal getSecreplypostid() {
        return this.secreplypostid;
    }

    public void setSecreplypostid(BigDecimal secreplypostid) {
        this.secreplypostid = secreplypostid;
    }

    public String getReplycontent() {
        return this.replycontent;
    }

    public void setReplycontent(String replycontent) {
        this.replycontent = replycontent;
    }

    public Date getReplytime() {
        return this.replytime;
    }

    public void setReplytime(Date replytime) {
        this.replytime = replytime;
    }

    public BigDecimal getSecid() {
        return this.secid;
    }

    public void setSecid(BigDecimal secid) {
        this.secid = secid;
    }

    public BigDecimal getUser() {
        return this.user;
    }

    public void setUser(BigDecimal user) {
        this.user = user;
    }

    public BigDecimal getReplypost() {
        return this.replypost;
    }

    public void setReplypost(BigDecimal replypost) {
        this.replypost = replypost;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("secreplypostid", getSecreplypostid())
            .toString();
    }

}
