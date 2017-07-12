package com.forum.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/** @author Hibernate CodeGenerator */
public class MarkPK implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** identifier field */
    private String username;

    /** identifier field */
    private BigDecimal postid;

    /** full constructor */
    public MarkPK(String username, BigDecimal postid) {
        this.username = username;
        this.postid = postid;
    }

    /** default constructor */
    public MarkPK() {
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public BigDecimal getPostid() {
        return this.postid;
    }

    public void setPostid(BigDecimal postid) {
        this.postid = postid;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("username", getUsername())
            .append("postid", getPostid())
            .toString();
    }

    public boolean equals(Object other) {
        if ( (this == other ) ) return true;
        if ( !(other instanceof MarkPK) ) return false;
        MarkPK castOther = (MarkPK) other;
        return new EqualsBuilder()
            .append(this.getUsername(), castOther.getUsername())
            .append(this.getPostid(), castOther.getPostid())
            .isEquals();
    }

    public int hashCode() {
        return new HashCodeBuilder()
            .append(getUsername())
            .append(getPostid())
            .toHashCode();
    }

}
