package com.forum.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import org.apache.commons.lang.builder.ToStringBuilder;


/** @author Hibernate CodeGenerator */
public class Forumannouncement implements Serializable {

    /** identifier field */
    private BigDecimal announcementid;

    /** persistent field */
    private Date createtime;

    /** persistent field */
    private String title;

    /** persistent field */
    private String content;

    /** nullable persistent field */
    private Date releasetime;

    /** persistent field */
    private com.forum.bean.User user;

    /** full constructor */
    public Forumannouncement(BigDecimal announcementid, Date createtime, String title, String content, Date releasetime, com.forum.bean.User user) {
        this.announcementid = announcementid;
        this.createtime = createtime;
        this.title = title;
        this.content = content;
        this.releasetime = releasetime;
        this.user = user;
    }

    /** default constructor */
    public Forumannouncement() {
    }

    /** minimal constructor */
    public Forumannouncement(BigDecimal announcementid, Date createtime, String title, String content, com.forum.bean.User user) {
        this.announcementid = announcementid;
        this.createtime = createtime;
        this.title = title;
        this.content = content;
        this.user = user;
    }

    public BigDecimal getAnnouncementid() {
        return this.announcementid;
    }

    public void setAnnouncementid(BigDecimal announcementid) {
        this.announcementid = announcementid;
    }

    public Date getCreatetime() {
        return this.createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getReleasetime() {
        return this.releasetime;
    }

    public void setReleasetime(Date releasetime) {
        this.releasetime = releasetime;
    }

    public com.forum.bean.User getUser() {
        return this.user;
    }

    public void setUser(com.forum.bean.User user) {
        this.user = user;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("announcementid", getAnnouncementid())
            .toString();
    }

}
