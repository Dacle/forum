package com.forum.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Clob;
import java.util.Date;
import org.apache.commons.lang.builder.ToStringBuilder;


/** @author Hibernate CodeGenerator */
public class Uploadfile implements Serializable {

    /** identifier field */
    private BigDecimal fileid;

    /** persistent field */
    private String filename;

    /** nullable persistent field */
    private Clob content;

    /** persistent field */
    private Date uploaddate;

    /** nullable persistent field */
    private String describe;

    /** persistent field */
    private BigDecimal filesize;

    /** nullable persistent field */
    private BigDecimal downloadtimes;

    /** persistent field */
    private BigDecimal postid;

    /** persistent field */
    private com.forum.bean.User user;

    /** full constructor */
    public Uploadfile(BigDecimal fileid, String filename, Clob content, Date uploaddate, String describe, BigDecimal filesize, BigDecimal downloadtimes, BigDecimal postid, com.forum.bean.User user) {
        this.fileid = fileid;
        this.filename = filename;
        this.content = content;
        this.uploaddate = uploaddate;
        this.describe = describe;
        this.filesize = filesize;
        this.downloadtimes = downloadtimes;
        this.postid = postid;
        this.user = user;
    }

    /** default constructor */
    public Uploadfile() {
    }

    /** minimal constructor */
    public Uploadfile(BigDecimal fileid, String filename, Date uploaddate, BigDecimal filesize, BigDecimal postid, com.forum.bean.User user) {
        this.fileid = fileid;
        this.filename = filename;
        this.uploaddate = uploaddate;
        this.filesize = filesize;
        this.postid = postid;
        this.user = user;
    }

    public BigDecimal getFileid() {
        return this.fileid;
    }

    public void setFileid(BigDecimal fileid) {
        this.fileid = fileid;
    }

    public String getFilename() {
        return this.filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public Clob getContent() {
        return this.content;
    }

    public void setContent(Clob content) {
        this.content = content;
    }

    public Date getUploaddate() {
        return this.uploaddate;
    }

    public void setUploaddate(Date uploaddate) {
        this.uploaddate = uploaddate;
    }

    public String getDescribe() {
        return this.describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public BigDecimal getFilesize() {
        return this.filesize;
    }

    public void setFilesize(BigDecimal filesize) {
        this.filesize = filesize;
    }

    public BigDecimal getDownloadtimes() {
        return this.downloadtimes;
    }

    public void setDownloadtimes(BigDecimal downloadtimes) {
        this.downloadtimes = downloadtimes;
    }

    public BigDecimal getPostid() {
        return this.postid;
    }

    public void setPostid(BigDecimal postid) {
        this.postid = postid;
    }

    public com.forum.bean.User getUser() {
        return this.user;
    }

    public void setUser(com.forum.bean.User user) {
        this.user = user;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("fileid", getFileid())
            .toString();
    }

}
