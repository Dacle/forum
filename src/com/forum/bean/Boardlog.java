package com.forum.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import org.apache.commons.lang.builder.ToStringBuilder;


/** @author Hibernate CodeGenerator */
public class Boardlog implements Serializable {

    /** identifier field */
    private BigDecimal boardlogid;

    /** persistent field */
    private Date boardlogdate;

    /** nullable persistent field */
    private BigDecimal postnum;

    /** nullable persistent field */
    private BigDecimal viewnum;

    /** nullable persistent field */
    private BigDecimal replynum;

    /** nullable persistent field */
    private BigDecimal todaybestpostid;

    /** nullable persistent field */
    private BigDecimal deletepostnum;

    /** nullable persistent field */
    private String remark;

    /** persistent field */
    private com.forum.bean.User user;

    /** persistent field */
    private com.forum.bean.Basicboard basicboard;

    /** persistent field */
    private com.forum.bean.Post post;

    /** full constructor */
    public Boardlog(BigDecimal boardlogid, Date boardlogdate, BigDecimal postnum, BigDecimal viewnum, BigDecimal replynum, BigDecimal todaybestpostid, BigDecimal deletepostnum, String remark, com.forum.bean.User user, com.forum.bean.Basicboard basicboard, com.forum.bean.Post post) {
        this.boardlogid = boardlogid;
        this.boardlogdate = boardlogdate;
        this.postnum = postnum;
        this.viewnum = viewnum;
        this.replynum = replynum;
        this.todaybestpostid = todaybestpostid;
        this.deletepostnum = deletepostnum;
        this.remark = remark;
        this.user = user;
        this.basicboard = basicboard;
        this.post = post;
    }

    /** default constructor */
    public Boardlog() {
    }

    /** minimal constructor */
    public Boardlog(BigDecimal boardlogid, Date boardlogdate, com.forum.bean.User user, com.forum.bean.Basicboard basicboard, com.forum.bean.Post post) {
        this.boardlogid = boardlogid;
        this.boardlogdate = boardlogdate;
        this.user = user;
        this.basicboard = basicboard;
        this.post = post;
    }

    public BigDecimal getBoardlogid() {
        return this.boardlogid;
    }

    public void setBoardlogid(BigDecimal boardlogid) {
        this.boardlogid = boardlogid;
    }

    public Date getBoardlogdate() {
        return this.boardlogdate;
    }

    public void setBoardlogdate(Date boardlogdate) {
        this.boardlogdate = boardlogdate;
    }

    public BigDecimal getPostnum() {
        return this.postnum;
    }

    public void setPostnum(BigDecimal postnum) {
        this.postnum = postnum;
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

    public BigDecimal getTodaybestpostid() {
        return this.todaybestpostid;
    }

    public void setTodaybestpostid(BigDecimal todaybestpostid) {
        this.todaybestpostid = todaybestpostid;
    }

    public BigDecimal getDeletepostnum() {
        return this.deletepostnum;
    }

    public void setDeletepostnum(BigDecimal deletepostnum) {
        this.deletepostnum = deletepostnum;
    }

    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public com.forum.bean.User getUser() {
        return this.user;
    }

    public void setUser(com.forum.bean.User user) {
        this.user = user;
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
            .append("boardlogid", getBoardlogid())
            .toString();
    }

}
