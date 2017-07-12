package com.forum.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/** @author Hibernate CodeGenerator */
public class RefindpwdPK implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** identifier field */
    private BigDecimal userid;

    /** identifier field */
    private String question;

    /** full constructor */
    public RefindpwdPK(BigDecimal userid, String question) {
        this.userid = userid;
        this.question = question;
    }

    /** default constructor */
    public RefindpwdPK() {
    }

    public BigDecimal getUserid() {
        return this.userid;
    }

    public void setUserid(BigDecimal userid) {
        this.userid = userid;
    }

    public String getQuestion() {
        return this.question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("userid", getUserid())
            .append("question", getQuestion())
            .toString();
    }

    public boolean equals(Object other) {
        if ( (this == other ) ) return true;
        if ( !(other instanceof RefindpwdPK) ) return false;
        RefindpwdPK castOther = (RefindpwdPK) other;
        return new EqualsBuilder()
            .append(this.getUserid(), castOther.getUserid())
            .append(this.getQuestion(), castOther.getQuestion())
            .isEquals();
    }

    public int hashCode() {
        return new HashCodeBuilder()
            .append(getUserid())
            .append(getQuestion())
            .toHashCode();
    }

}
