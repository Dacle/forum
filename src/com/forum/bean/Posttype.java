package com.forum.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Set;
import org.apache.commons.lang.builder.ToStringBuilder;


/** @author Hibernate CodeGenerator */
public class Posttype implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** identifier field */
    private BigDecimal posttypeid;

    /** persistent field */
    private String posttypename;

    /** persistent field */
    private Set posts;

    /** full constructor */
    public Posttype(BigDecimal posttypeid, String posttypename, Set posts) {
        this.posttypeid = posttypeid;
        this.posttypename = posttypename;
        this.posts = posts;
    }

    /** default constructor */
    public Posttype() {
    }

    public BigDecimal getPosttypeid() {
        return this.posttypeid;
    }

    public void setPosttypeid(BigDecimal posttypeid) {
        this.posttypeid = posttypeid;
    }

    public String getPosttypename() {
        return this.posttypename;
    }

    public void setPosttypename(String posttypename) {
        this.posttypename = posttypename;
    }

    public Set getPosts() {
        return this.posts;
    }

    public void setPosts(Set posts) {
        this.posts = posts;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("posttypeid", getPosttypeid())
            .toString();
    }

}
