package com.forum.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


/** @author Hibernate CodeGenerator */
public class Basicboard implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** identifier field */
    private BigDecimal boardid;

    /** persistent field */
    private String boardname;

    /** persistent field */
    private BigDecimal parentid;

    /** nullable persistent field */
    private String readme;

    /** nullable persistent field */
    private BigDecimal postnum;

    /** persistent field */
    private Date buildtime;

    /** nullable persistent field */
    private BigDecimal clicknum;

    /** nullable persistent field */
    private String indeximg;

    /** nullable persistent field */
    private BigDecimal hottopicnum;

    /** nullable persistent field */
    private BigDecimal toptopicnum;

    /** persistent field */
    private BigDecimal user;

    /** persistent field */
    private BigDecimal state;

    /** persistent field */
    private BigDecimal mainboard;

    /** full constructor */
    public Basicboard(BigDecimal boardid, String boardname, BigDecimal parentid, String readme, BigDecimal postnum, Date buildtime, BigDecimal clicknum, String indeximg, BigDecimal hottopicnum, BigDecimal toptopicnum,BigDecimal user, BigDecimal userstate, BigDecimal mainboard) {
        this.boardid = boardid;
        this.boardname = boardname;
        this.parentid = parentid;
        this.readme = readme;
        this.postnum = postnum;
        this.buildtime = buildtime;
        this.clicknum = clicknum;
        this.indeximg = indeximg;
        this.hottopicnum = hottopicnum;
        this.toptopicnum = toptopicnum;
        this.user = user;
        this.state = userstate;
        this.mainboard = mainboard;
    }

    /** default constructor */
    public Basicboard() {
    }

    /** minimal constructor */
    public Basicboard(BigDecimal boardid, String boardname, BigDecimal parentid, Date buildtime, BigDecimal user, BigDecimal userstate, BigDecimal mainboar) {
        this.boardid = boardid;
        this.boardname = boardname;
        this.parentid = parentid;
        this.buildtime = buildtime;
        this.user = user;
        this.state = userstate;
        this.mainboard = mainboard;
    }

    public BigDecimal getBoardid() {
        return this.boardid;
    }

    public void setBoardid(BigDecimal boardid) {
        this.boardid = boardid;
    }

    public String getBoardname() {
        return this.boardname;
    }

    public void setBoardname(String boardname) {
        this.boardname = boardname;
    }

    public BigDecimal getParentid() {
        return this.parentid;
    }

    public void setParentid(BigDecimal parentid) {
        this.parentid = parentid;
    }

    public String getReadme() {
        return this.readme;
    }

    public void setReadme(String readme) {
        this.readme = readme;
    }

    public BigDecimal getPostnum() {
        return this.postnum;
    }

    public void setPostnum(BigDecimal postnum) {
        this.postnum = postnum;
    }

    public Date getBuildtime() {
        return this.buildtime;
    }

    public void setBuildtime(Date buildtime) {
        this.buildtime = buildtime;
    }

    public BigDecimal getClicknum() {
        return this.clicknum;
    }

    public void setClicknum(BigDecimal clicknum) {
        this.clicknum = clicknum;
    }

    public String getIndeximg() {
        return this.indeximg;
    }

    public void setIndeximg(String indeximg) {
        this.indeximg = indeximg;
    }

    public BigDecimal getHottopicnum() {
        return this.hottopicnum;
    }

    public void setHottopicnum(BigDecimal hottopicnum) {
        this.hottopicnum = hottopicnum;
    }

    public BigDecimal getToptopicnum() {
        return this.toptopicnum;
    }

    public void setToptopicnum(BigDecimal toptopicnum) {
        this.toptopicnum = toptopicnum;
    }

    public BigDecimal getUser() {
        return this.user;
    }

    public void setUser(BigDecimal user) {
        this.user = user;
    }

    public BigDecimal getUserstate() {
        return this.state;
    }

    public void setUserstate(BigDecimal userstate) {
        this.state = userstate;
    }

    public BigDecimal getMainboard() {
        return this.mainboard;
    }

    public void setMainboard(BigDecimal mainboard) {
        this.mainboard = mainboard;
    }
}
