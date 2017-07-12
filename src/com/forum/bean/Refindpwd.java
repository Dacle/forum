package com.forum.bean;

import java.io.Serializable;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/** @author Hibernate CodeGenerator */
public class Refindpwd implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** identifier field */
    private com.forum.bean.RefindpwdPK comp_id;

    /** persistent field */
    private String answer;

    /** full constructor */
    public Refindpwd(com.forum.bean.RefindpwdPK comp_id, String answer) {
        this.comp_id = comp_id;
        this.answer = answer;
    }

    /** default constructor */
    public Refindpwd() {
    }

    public com.forum.bean.RefindpwdPK getComp_id() {
        return this.comp_id;
    }

    public void setComp_id(com.forum.bean.RefindpwdPK comp_id) {
        this.comp_id = comp_id;
    }

    public String getAnswer() {
        return this.answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("comp_id", getComp_id())
            .toString();
    }

    public boolean equals(Object other) {
        if ( (this == other ) ) return true;
        if ( !(other instanceof Refindpwd) ) return false;
        Refindpwd castOther = (Refindpwd) other;
        return new EqualsBuilder()
            .append(this.getComp_id(), castOther.getComp_id())
            .isEquals();
    }

    public int hashCode() {
        return new HashCodeBuilder()
            .append(getComp_id())
            .toHashCode();
    }

}
