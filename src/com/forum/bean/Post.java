package com.forum.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import org.apache.commons.lang.builder.ToStringBuilder;


/** @author Hibernate CodeGenerator */
public class Post implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** identifier field */
    private BigDecimal postid;

    /** persistent field */
    private String posttitle;

    /** persistent field */
    private String postcontent;

    /** persistent field */
    private Date sendtime;

    /** nullable persistent field */
    private BigDecimal totalviewnum;

    /** nullable persistent field */
    private BigDecimal totalreplynum;

    /** nullable persistent field */
    private BigDecimal zannum;

    /** nullable persistent field */
    private BigDecimal totop;

    /** nullable persistent field */
    private BigDecimal tohot;

    /** persistent field */
    private BigDecimal boardpoststate;

    /** persistent field */
    private BigDecimal user;

    /** persistent field */
    private BigDecimal basicboard;

    /** persistent field */
    private BigDecimal posttype;


    /** full constructor */
    public Post(BigDecimal postid, String posttitle, String postcontent, Date sendtime, BigDecimal totalviewnum, BigDecimal totalreplynum, BigDecimal zannum, BigDecimal totop, BigDecimal tohot, BigDecimal boardpoststate, BigDecimal user, BigDecimal basicboard, BigDecimal posttype) {
        this.postid = postid;
        this.posttitle = posttitle;
        this.postcontent = postcontent;
        this.sendtime = sendtime;
        this.totalviewnum = totalviewnum;
        this.totalreplynum = totalreplynum;
        this.zannum = zannum;
        this.totop = totop;
        this.tohot = tohot;
        this.boardpoststate = boardpoststate;
        this.user = user;
        this.basicboard = basicboard;
        this.posttype = posttype;
    }

    /** default constructor */
    public Post() {
    }

    /** minimal constructor */
    public Post(BigDecimal postid, String posttitle, String postcontent, Date sendtime, BigDecimal boardpoststate, BigDecimal user, BigDecimal basicboard, BigDecimal posttype) {
        this.postid = postid;
        this.posttitle = posttitle;
        this.postcontent = postcontent;
        this.sendtime = sendtime;
        this.boardpoststate = boardpoststate;
        this.user = user;
        this.basicboard = basicboard;
        this.posttype = posttype;
    }

    public BigDecimal getPostid() {
        return this.postid;
    }

    public void setPostid(BigDecimal postid) {
        this.postid = postid;
    }

    public String getPosttitle() {
        return this.posttitle;
    }

    public void setPosttitle(String posttitle) {
        this.posttitle = posttitle;
    }

    public String getPostcontent() {
        return this.postcontent;
    }

    public void setPostcontent(String postcontent) {
        this.postcontent = postcontent;
    }

    public Date getSendtime() {
        return this.sendtime;
    }

    public void setSendtime(Date sendtime) {
        this.sendtime = sendtime;
    }

    public BigDecimal getTotalviewnum() {
        return this.totalviewnum;
    }

    public void setTotalviewnum(BigDecimal totalviewnum) {
        this.totalviewnum = totalviewnum;
    }

    public BigDecimal getTotalreplynum() {
        return this.totalreplynum;
    }

    public void setTotalreplynum(BigDecimal totalreplynum) {
        this.totalreplynum = totalreplynum;
    }

    public BigDecimal getZannum() {
        return this.zannum;
    }

    public void setZannum(BigDecimal zannum) {
        this.zannum = zannum;
    }

    public BigDecimal getTotop() {
        return this.totop;
    }

    public void setTotop(BigDecimal totop) {
        this.totop = totop;
    }

    public BigDecimal getTohot() {
        return this.tohot;
    }

    public void setTohot(BigDecimal tohot) {
        this.tohot = tohot;
    }

    public BigDecimal getBoardpoststate() {
        return this.boardpoststate;
    }

    public void setBoardpoststate(BigDecimal boardpoststate) {
        this.boardpoststate = boardpoststate;
    }

    public BigDecimal getUser() {
        return this.user;
    }

    public void setUser(BigDecimal user) {
        this.user = user;
    }

    public BigDecimal getBasicboard() {
        return this.basicboard;
    }

    public void setBasicboard(BigDecimal basicboard) {
        this.basicboard = basicboard;
    }

    public BigDecimal getPosttype() {
        return this.posttype;
    }

    public void setPosttype(BigDecimal posttype) {
        this.posttype = posttype;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("postid", getPostid())
            .toString();
    }

}
