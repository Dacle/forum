package com.forum.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;
import org.apache.commons.lang.builder.ToStringBuilder;


/** @author Hibernate CodeGenerator */
public class Replypost implements Serializable {

    /** identifier field */
    private BigDecimal replypostid;

    /** nullable persistent field */
    private BigDecimal fileid;

    /** nullable persistent field */
    private String replytitle;

    /** nullable persistent field */
    private String replycontent;

    /** nullable persistent field */
    private Date replytime;

    /** persistent field */
    private BigDecimal user;

    /** persistent field */
    private BigDecimal post;

    /** persistent field */
    private Set secreplyposts;

    /** full constructor */
    public Replypost(BigDecimal replypostid, BigDecimal fileid, String replytitle, String replycontent, Date replytime, BigDecimal user, BigDecimal post, Set secreplyposts) {
        this.replypostid = replypostid;
        this.fileid = fileid;
        this.replytitle = replytitle;
        this.replycontent = replycontent;
        this.replytime = replytime;
        this.user = user;
        this.post = post;
        this.secreplyposts = secreplyposts;
    }

    /** default constructor */
    public Replypost() {
    }

    /** minimal constructor */
    public Replypost(BigDecimal replypostid, BigDecimal user, BigDecimal post, Set secreplyposts) {
        this.replypostid = replypostid;
        this.user = user;
        this.post = post;
        this.secreplyposts = secreplyposts;
    }

    public BigDecimal getReplypostid() {
        return this.replypostid;
    }

    public void setReplypostid(BigDecimal replypostid) {
        this.replypostid = replypostid;
    }

    public BigDecimal getFileid() {
        return this.fileid;
    }

    public void setFileid(BigDecimal fileid) {
        this.fileid = fileid;
    }

    public String getReplytitle() {
        return this.replytitle;
    }

    public void setReplytitle(String replytitle) {
        this.replytitle = replytitle;
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

    public BigDecimal getUser() {
        return this.user;
    }

    public void setUser(BigDecimal user) {
        this.user = user;
    }

    public BigDecimal getPost() {
        return this.post;
    }

    public void setPost(BigDecimal post) {
        this.post = post;
    }

    public Set getSecreplyposts() {
        return this.secreplyposts;
    }

    public void setSecreplyposts(Set secreplyposts) {
        this.secreplyposts = secreplyposts;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("replypostid", getReplypostid())
            .toString();
    }

}
