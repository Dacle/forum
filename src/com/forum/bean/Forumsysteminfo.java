package com.forum.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import org.apache.commons.lang.builder.ToStringBuilder;


/** @author Hibernate CodeGenerator */
public class Forumsysteminfo implements Serializable {

    /** identifier field */
    private BigDecimal forumsystemid;

    /** persistent field */
    private String forumversion;

    /** nullable persistent field */
    private String forumname;

    /** persistent field */
    private String forumaddress;

    /** persistent field */
    private String administratorname;

    /** persistent field */
    private String administratorpwd;

    /** persistent field */
    private BigDecimal adminnum;

    /** persistent field */
    private BigDecimal moderatornum;

    /** persistent field */
    private BigDecimal usernum;

    /** persistent field */
    private BigDecimal maxonlineusernum;

    /** nullable persistent field */
    private Date maxonlinedate;

    /** nullable persistent field */
    private BigDecimal singlepagepostnum;

    /** nullable persistent field */
    private BigDecimal maxdailypostnum;

    /** nullable persistent field */
    private Date maxdailypostdate;

    /** nullable persistent field */
    private BigDecimal maxregisternum;

    /** nullable persistent field */
    private Date maxregisterdate;

    /** full constructor */
    public Forumsysteminfo(BigDecimal forumsystemid, String forumversion, String forumname, String forumaddress, String administratorname, String administratorpwd, BigDecimal adminnum, BigDecimal moderatornum, BigDecimal usernum, BigDecimal maxonlineusernum, Date maxonlinedate, BigDecimal singlepagepostnum, BigDecimal maxdailypostnum, Date maxdailypostdate, BigDecimal maxregisternum, Date maxregisterdate) {
        this.forumsystemid = forumsystemid;
        this.forumversion = forumversion;
        this.forumname = forumname;
        this.forumaddress = forumaddress;
        this.administratorname = administratorname;
        this.administratorpwd = administratorpwd;
        this.adminnum = adminnum;
        this.moderatornum = moderatornum;
        this.usernum = usernum;
        this.maxonlineusernum = maxonlineusernum;
        this.maxonlinedate = maxonlinedate;
        this.singlepagepostnum = singlepagepostnum;
        this.maxdailypostnum = maxdailypostnum;
        this.maxdailypostdate = maxdailypostdate;
        this.maxregisternum = maxregisternum;
        this.maxregisterdate = maxregisterdate;
    }

    /** default constructor */
    public Forumsysteminfo() {
    }

    /** minimal constructor */
    public Forumsysteminfo(BigDecimal forumsystemid, String forumversion, String forumaddress, String administratorname, String administratorpwd, BigDecimal adminnum, BigDecimal moderatornum, BigDecimal usernum, BigDecimal maxonlineusernum) {
        this.forumsystemid = forumsystemid;
        this.forumversion = forumversion;
        this.forumaddress = forumaddress;
        this.administratorname = administratorname;
        this.administratorpwd = administratorpwd;
        this.adminnum = adminnum;
        this.moderatornum = moderatornum;
        this.usernum = usernum;
        this.maxonlineusernum = maxonlineusernum;
    }

    public BigDecimal getForumsystemid() {
        return this.forumsystemid;
    }

    public void setForumsystemid(BigDecimal forumsystemid) {
        this.forumsystemid = forumsystemid;
    }

    public String getForumversion() {
        return this.forumversion;
    }

    public void setForumversion(String forumversion) {
        this.forumversion = forumversion;
    }

    public String getForumname() {
        return this.forumname;
    }

    public void setForumname(String forumname) {
        this.forumname = forumname;
    }

    public String getForumaddress() {
        return this.forumaddress;
    }

    public void setForumaddress(String forumaddress) {
        this.forumaddress = forumaddress;
    }

    public String getAdministratorname() {
        return this.administratorname;
    }

    public void setAdministratorname(String administratorname) {
        this.administratorname = administratorname;
    }

    public String getAdministratorpwd() {
        return this.administratorpwd;
    }

    public void setAdministratorpwd(String administratorpwd) {
        this.administratorpwd = administratorpwd;
    }

    public BigDecimal getAdminnum() {
        return this.adminnum;
    }

    public void setAdminnum(BigDecimal adminnum) {
        this.adminnum = adminnum;
    }

    public BigDecimal getModeratornum() {
        return this.moderatornum;
    }

    public void setModeratornum(BigDecimal moderatornum) {
        this.moderatornum = moderatornum;
    }

    public BigDecimal getUsernum() {
        return this.usernum;
    }

    public void setUsernum(BigDecimal usernum) {
        this.usernum = usernum;
    }

    public BigDecimal getMaxonlineusernum() {
        return this.maxonlineusernum;
    }

    public void setMaxonlineusernum(BigDecimal maxonlineusernum) {
        this.maxonlineusernum = maxonlineusernum;
    }

    public Date getMaxonlinedate() {
        return this.maxonlinedate;
    }

    public void setMaxonlinedate(Date maxonlinedate) {
        this.maxonlinedate = maxonlinedate;
    }

    public BigDecimal getSinglepagepostnum() {
        return this.singlepagepostnum;
    }

    public void setSinglepagepostnum(BigDecimal singlepagepostnum) {
        this.singlepagepostnum = singlepagepostnum;
    }

    public BigDecimal getMaxdailypostnum() {
        return this.maxdailypostnum;
    }

    public void setMaxdailypostnum(BigDecimal maxdailypostnum) {
        this.maxdailypostnum = maxdailypostnum;
    }

    public Date getMaxdailypostdate() {
        return this.maxdailypostdate;
    }

    public void setMaxdailypostdate(Date maxdailypostdate) {
        this.maxdailypostdate = maxdailypostdate;
    }

    public BigDecimal getMaxregisternum() {
        return this.maxregisternum;
    }

    public void setMaxregisternum(BigDecimal maxregisternum) {
        this.maxregisternum = maxregisternum;
    }

    public Date getMaxregisterdate() {
        return this.maxregisterdate;
    }

    public void setMaxregisterdate(Date maxregisterdate) {
        this.maxregisterdate = maxregisterdate;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("forumsystemid", getForumsystemid())
            .toString();
    }

}
