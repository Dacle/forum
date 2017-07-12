package com.forum.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Blob;
import org.apache.commons.lang.builder.ToStringBuilder;


/** @author Hibernate CodeGenerator */
public class Externallink implements Serializable {

    /** identifier field */
    private BigDecimal linkid;

    /** persistent field */
    private String linkname;

    /** persistent field */
    private String linkurl;

    /** nullable persistent field */
    private BigDecimal linkorder;

    /** nullable persistent field */
    private Blob linklogo;

    /** nullable persistent field */
    private String linkdescription;

    /** full constructor */
    public Externallink(BigDecimal linkid, String linkname, String linkurl, BigDecimal linkorder, Blob linklogo, String linkdescription) {
        this.linkid = linkid;
        this.linkname = linkname;
        this.linkurl = linkurl;
        this.linkorder = linkorder;
        this.linklogo = linklogo;
        this.linkdescription = linkdescription;
    }

    /** default constructor */
    public Externallink() {
    }

    /** minimal constructor */
    public Externallink(BigDecimal linkid, String linkname, String linkurl) {
        this.linkid = linkid;
        this.linkname = linkname;
        this.linkurl = linkurl;
    }

    public BigDecimal getLinkid() {
        return this.linkid;
    }

    public void setLinkid(BigDecimal linkid) {
        this.linkid = linkid;
    }

    public String getLinkname() {
        return this.linkname;
    }

    public void setLinkname(String linkname) {
        this.linkname = linkname;
    }

    public String getLinkurl() {
        return this.linkurl;
    }

    public void setLinkurl(String linkurl) {
        this.linkurl = linkurl;
    }

    public BigDecimal getLinkorder() {
        return this.linkorder;
    }

    public void setLinkorder(BigDecimal linkorder) {
        this.linkorder = linkorder;
    }

    public Blob getLinklogo() {
        return this.linklogo;
    }

    public void setLinklogo(Blob linklogo) {
        this.linklogo = linklogo;
    }

    public String getLinkdescription() {
        return this.linkdescription;
    }

    public void setLinkdescription(String linkdescription) {
        this.linkdescription = linkdescription;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("linkid", getLinkid())
            .toString();
    }

}
