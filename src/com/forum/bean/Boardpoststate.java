package com.forum.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Set;
import org.apache.commons.lang.builder.ToStringBuilder;


/** @author Hibernate CodeGenerator */
public class Boardpoststate implements Serializable {

    /** identifier field */
    private BigDecimal stateid;

    /** persistent field */
    private String statetype;

    /** persistent field */
    private Set posts;

    /** full constructor */
    public Boardpoststate(BigDecimal stateid, String statetype, Set posts) {
        this.stateid = stateid;
        this.statetype = statetype;
        this.posts = posts;
    }

    /** default constructor */
    public Boardpoststate() {
    }

    public BigDecimal getStateid() {
        return this.stateid;
    }

    public void setStateid(BigDecimal stateid) {
        this.stateid = stateid;
    }

    public String getStatetype() {
        return this.statetype;
    }

    public void setStatetype(String statetype) {
        this.statetype = statetype;
    }

    public Set getPosts() {
        return this.posts;
    }

    public void setPosts(Set posts) {
        this.posts = posts;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("stateid", getStateid())
            .toString();
    }

}
