package com.forum.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import org.apache.commons.lang.builder.ToStringBuilder;


/** @author Hibernate CodeGenerator */
public class Forumsystemlog implements Serializable {

    /** identifier field */
    private BigDecimal forumsystemlogid;

    /** persistent field */
    private Date logdate;

    /** nullable persistent field */
    private BigDecimal postnum;

    /** nullable persistent field */
    private BigDecimal registernum;

    /** nullable persistent field */
    private BigDecimal onlinenum;

    /** nullable persistent field */
    private BigDecimal toppednum;

    /** nullable persistent field */
    private BigDecimal viewnum;

    /** nullable persistent field */
    private BigDecimal replynum;

    /** nullable persistent field */
    private BigDecimal starpostnum;

    /** nullable persistent field */
    private String remark;

    /** persistent field */
    private com.forum.bean.Basicboard basicboard;

    /** persistent field */
    private com.forum.bean.Post post;

    /** full constructor */
    public Forumsystemlog(BigDecimal forumsystemlogid, Date logdate, BigDecimal postnum, BigDecimal registernum, BigDecimal onlinenum, BigDecimal toppednum, BigDecimal viewnum, BigDecimal replynum, BigDecimal starpostnum, String remark, com.forum.bean.Basicboard basicboard, com.forum.bean.Post post) {
        this.forumsystemlogid = forumsystemlogid;
        this.logdate = logdate;
        this.postnum = postnum;
        this.registernum = registernum;
        this.onlinenum = onlinenum;
        this.toppednum = toppednum;
        this.viewnum = viewnum;
        this.replynum = replynum;
        this.starpostnum = starpostnum;
        this.remark = remark;
        this.basicboard = basicboard;
        this.post = post;
    }

    /** default constructor */
    public Forumsystemlog() {
    }

    /** minimal constructor */
    public Forumsystemlog(BigDecimal forumsystemlogid, Date logdate, com.forum.bean.Basicboard basicboard, com.forum.bean.Post post) {
        this.forumsystemlogid = forumsystemlogid;
        this.logdate = logdate;
        this.basicboard = basicboard;
        this.post = post;
    }

    public BigDecimal getForumsystemlogid() {
        return this.forumsystemlogid;
    }

    public void setForumsystemlogid(BigDecimal forumsystemlogid) {
        this.forumsystemlogid = forumsystemlogid;
    }

    public Date getLogdate() {
        return this.logdate;
    }

    public void setLogdate(Date logdate) {
        this.logdate = logdate;
    }

    public BigDecimal getPostnum() {
        return this.postnum;
    }

    public void setPostnum(BigDecimal postnum) {
        this.postnum = postnum;
    }

    public BigDecimal getRegisternum() {
        return this.registernum;
    }

    public void setRegisternum(BigDecimal registernum) {
        this.registernum = registernum;
    }

    public BigDecimal getOnlinenum() {
        return this.onlinenum;
    }

    public void setOnlinenum(BigDecimal onlinenum) {
        this.onlinenum = onlinenum;
    }

    public BigDecimal getToppednum() {
        return this.toppednum;
    }

    public void setToppednum(BigDecimal toppednum) {
        this.toppednum = toppednum;
    }

    public BigDecimal getViewnum() {
        return this.viewnum;
    }

    public void setViewnum(BigDecimal viewnum) {
        this.viewnum = viewnum;
    }

    public BigDecimal getReplynum() {
        return this.replynum;
    }

    public void setReplynum(BigDecimal replynum) {
        this.replynum = replynum;
    }

    public BigDecimal getStarpostnum() {
        return this.starpostnum;
    }

    public void setStarpostnum(BigDecimal starpostnum) {
        this.starpostnum = starpostnum;
    }

    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public com.forum.bean.Basicboard getBasicboard() {
        return this.basicboard;
    }

    public void setBasicboard(com.forum.bean.Basicboard basicboard) {
        this.basicboard = basicboard;
    }

    public com.forum.bean.Post getPost() {
        return this.post;
    }

    public void setPost(com.forum.bean.Post post) {
        this.post = post;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("forumsystemlogid", getForumsystemlogid())
            .toString();
    }

}
