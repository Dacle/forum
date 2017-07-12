package com.forum.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Blob;
import java.util.Date;
import java.util.Set;
import org.apache.commons.lang.builder.ToStringBuilder;


/** @author Hibernate CodeGenerator */
public class User implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** identifier field */
    private BigDecimal userid;

    /** persistent field */
    private String username;

    /** persistent field */
    private String userpwd;

    /** nullable persistent field */
    private BigDecimal typeid;

    /** nullable persistent field */
    private BigDecimal stateid;

    /** persistent field */
    private String title;

    /** nullable persistent field */
    private BigDecimal classify;

    /** nullable persistent field */
    private BigDecimal ep;

    /** nullable persistent field */
    private BigDecimal cp;

    /** nullable persistent field */
    private BigDecimal power;

    /** nullable persistent field */
    private String email;

    /** nullable persistent field */
    private String lastip;

    /** nullable persistent field */
    private Date lastdate;

    /** persistent field */
    private Date registdate;

    /** persistent field */
    private String sex;

    /** nullable persistent field */
    private Date birthday;

    /** nullable persistent field */
    private BigDecimal postnum;

    /** nullable persistent field */
    private BigDecimal hottopic;

    /** nullable persistent field */
    private String sign;

    /** nullable persistent field */
    private Blob face;

    /** nullable persistent field */
    private BigDecimal width;

    /** nullable persistent field */
    private BigDecimal height;

    /** nullable persistent field */
    private String personnelweb;

    /** nullable persistent field */
    private String qq;

    /** nullable persistent field */
    private String intro;

    /** nullable persistent field */
    private BigDecimal facestate;

    /** nullable persistent field */
    private BigDecimal signstate;

    /** nullable persistent field */
    private BigDecimal logintimes;

    /** nullable persistent field */
    private BigDecimal toptopic;

    /** nullable persistent field */
    private com.forum.bean.Usertyperequest usertyperequest;

    /** persistent field */
    private Set replyposts;

    /** persistent field */
    private Set mainboards;

    /** persistent field */
    private Set posts;

    /** persistent field */
    private Set boardlogs;

    /** persistent field */
    private Set uploadfiles;

    /** persistent field */
    private Set secreplyposts;

    /** persistent field */
    private Set forumannouncements;

    /** persistent field */
    private Set basicboards;

    /** persistent field */
    private Set managerecords;

    /** full constructor */
    public User(BigDecimal userid, String username, String userpwd, BigDecimal typeid, BigDecimal stateid, String title, BigDecimal classify, BigDecimal ep, BigDecimal cp, BigDecimal power, String email, String lastip, Date lastdate, Date registdate, String sex, Date birthday, BigDecimal postnum, BigDecimal hottopic, String sign, Blob face, BigDecimal width, BigDecimal height, String personnelweb, String qq, String intro, BigDecimal facestate, BigDecimal signstate, BigDecimal logintimes, BigDecimal toptopic, com.forum.bean.Usertyperequest usertyperequest, Set replyposts, Set mainboards, Set posts, Set boardlogs, Set uploadfiles, Set secreplyposts, Set forumannouncements, Set basicboards, Set managerecords) {
        this.userid = userid;
        this.username = username;
        this.userpwd = userpwd;
        this.typeid = typeid;
        this.stateid = stateid;
        this.title = title;
        this.classify = classify;
        this.ep = ep;
        this.cp = cp;
        this.power = power;
        this.email = email;
        this.lastip = lastip;
        this.lastdate = lastdate;
        this.registdate = registdate;
        this.sex = sex;
        this.birthday = birthday;
        this.postnum = postnum;
        this.hottopic = hottopic;
        this.sign = sign;
        this.face = face;
        this.width = width;
        this.height = height;
        this.personnelweb = personnelweb;
        this.qq = qq;
        this.intro = intro;
        this.facestate = facestate;
        this.signstate = signstate;
        this.logintimes = logintimes;
        this.toptopic = toptopic;
        this.usertyperequest = usertyperequest;
        this.replyposts = replyposts;
        this.mainboards = mainboards;
        this.posts = posts;
        this.boardlogs = boardlogs;
        this.uploadfiles = uploadfiles;
        this.secreplyposts = secreplyposts;
        this.forumannouncements = forumannouncements;
        this.basicboards = basicboards;
        this.managerecords = managerecords;
    }

    /** default constructor */
    public User() {
    }

    /** minimal constructor */
    public User(BigDecimal userid, String username, String userpwd, String title, Date registdate, String sex, Set replyposts, Set mainboards, Set posts, Set boardlogs, Set uploadfiles, Set secreplyposts, Set forumannouncements, Set basicboards, Set managerecords) {
        this.userid = userid;
        this.username = username;
        this.userpwd = userpwd;
        this.title = title;
        this.registdate = registdate;
        this.sex = sex;
        this.replyposts = replyposts;
        this.mainboards = mainboards;
        this.posts = posts;
        this.boardlogs = boardlogs;
        this.uploadfiles = uploadfiles;
        this.secreplyposts = secreplyposts;
        this.forumannouncements = forumannouncements;
        this.basicboards = basicboards;
        this.managerecords = managerecords;
    }

    public BigDecimal getUserid() {
        return this.userid;
    }

    public void setUserid(BigDecimal userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpwd() {
        return this.userpwd;
    }

    public void setUserpwd(String userpwd) {
        this.userpwd = userpwd;
    }

    public BigDecimal getTypeid() {
        return this.typeid;
    }

    public void setTypeid(BigDecimal typeid) {
        this.typeid = typeid;
    }

    public BigDecimal getStateid() {
        return this.stateid;
    }

    public void setStateid(BigDecimal stateid) {
        this.stateid = stateid;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BigDecimal getClassify() {
        return this.classify;
    }

    public void setClassify(BigDecimal classify) {
        this.classify = classify;
    }

    public BigDecimal getEp() {
        return this.ep;
    }

    public void setEp(BigDecimal ep) {
        this.ep = ep;
    }

    public BigDecimal getCp() {
        return this.cp;
    }

    public void setCp(BigDecimal cp) {
        this.cp = cp;
    }

    public BigDecimal getPower() {
        return this.power;
    }

    public void setPower(BigDecimal power) {
        this.power = power;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastip() {
        return this.lastip;
    }

    public void setLastip(String lastip) {
        this.lastip = lastip;
    }

    public Date getLastdate() {
        return this.lastdate;
    }

    public void setLastdate(Date lastdate) {
        this.lastdate = lastdate;
    }

    public Date getRegistdate() {
        return this.registdate;
    }

    public void setRegistdate(Date registdate) {
        this.registdate = registdate;
    }

    public String getSex() {
        return this.sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return this.birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public BigDecimal getPostnum() {
        return this.postnum;
    }

    public void setPostnum(BigDecimal postnum) {
        this.postnum = postnum;
    }

    public BigDecimal getHottopic() {
        return this.hottopic;
    }

    public void setHottopic(BigDecimal hottopic) {
        this.hottopic = hottopic;
    }

    public String getSign() {
        return this.sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public Blob getFace() {
        return this.face;
    }

    public void setFace(Blob face) {
        this.face = face;
    }

    public BigDecimal getWidth() {
        return this.width;
    }

    public void setWidth(BigDecimal width) {
        this.width = width;
    }

    public BigDecimal getHeight() {
        return this.height;
    }

    public void setHeight(BigDecimal height) {
        this.height = height;
    }

    public String getPersonnelweb() {
        return this.personnelweb;
    }

    public void setPersonnelweb(String personnelweb) {
        this.personnelweb = personnelweb;
    }

    public String getQq() {
        return this.qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getIntro() {
        return this.intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public BigDecimal getFacestate() {
        return this.facestate;
    }

    public void setFacestate(BigDecimal facestate) {
        this.facestate = facestate;
    }

    public BigDecimal getSignstate() {
        return this.signstate;
    }

    public void setSignstate(BigDecimal signstate) {
        this.signstate = signstate;
    }

    public BigDecimal getLogintimes() {
        return this.logintimes;
    }

    public void setLogintimes(BigDecimal logintimes) {
        this.logintimes = logintimes;
    }

    public BigDecimal getToptopic() {
        return this.toptopic;
    }

    public void setToptopic(BigDecimal toptopic) {
        this.toptopic = toptopic;
    }

    public com.forum.bean.Usertyperequest getUsertyperequest() {
        return this.usertyperequest;
    }

    public void setUsertyperequest(com.forum.bean.Usertyperequest usertyperequest) {
        this.usertyperequest = usertyperequest;
    }

    public Set getReplyposts() {
        return this.replyposts;
    }

    public void setReplyposts(Set replyposts) {
        this.replyposts = replyposts;
    }

    public Set getMainboards() {
        return this.mainboards;
    }

    public void setMainboards(Set mainboards) {
        this.mainboards = mainboards;
    }

    public Set getPosts() {
        return this.posts;
    }

    public void setPosts(Set posts) {
        this.posts = posts;
    }

    public Set getBoardlogs() {
        return this.boardlogs;
    }

    public void setBoardlogs(Set boardlogs) {
        this.boardlogs = boardlogs;
    }

    public Set getUploadfiles() {
        return this.uploadfiles;
    }

    public void setUploadfiles(Set uploadfiles) {
        this.uploadfiles = uploadfiles;
    }

    public Set getSecreplyposts() {
        return this.secreplyposts;
    }

    public void setSecreplyposts(Set secreplyposts) {
        this.secreplyposts = secreplyposts;
    }

    public Set getForumannouncements() {
        return this.forumannouncements;
    }

    public void setForumannouncements(Set forumannouncements) {
        this.forumannouncements = forumannouncements;
    }

    public Set getBasicboards() {
        return this.basicboards;
    }

    public void setBasicboards(Set basicboards) {
        this.basicboards = basicboards;
    }

    public Set getManagerecords() {
        return this.managerecords;
    }

    public void setManagerecords(Set managerecords) {
        this.managerecords = managerecords;
    }

}
