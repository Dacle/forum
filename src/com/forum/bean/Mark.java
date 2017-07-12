package com.forum.bean;

import java.io.Serializable;
import java.util.Date;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/** @author Hibernate CodeGenerator */
public class Mark implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** identifier field */
    private com.forum.bean.MarkPK comp_id;

    /** nullable persistent field */
    private Date addtime;

    /** full constructor */
    public Mark(com.forum.bean.MarkPK comp_id, Date addtime) {
        this.comp_id = comp_id;
        this.addtime = addtime;
    }

    /** default constructor */
    public Mark() {
    }

    /** minimal constructor */
    public Mark(com.forum.bean.MarkPK comp_id) {
        this.comp_id = comp_id;
    }

    public com.forum.bean.MarkPK getComp_id() {
        return this.comp_id;
    }

    public void setComp_id(com.forum.bean.MarkPK comp_id) {
        this.comp_id = comp_id;
    }

    public Date getAddtime() {
        return this.addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("comp_id", getComp_id())
            .toString();
    }

    public boolean equals(Object other) {
        if ( (this == other ) ) return true;
        if ( !(other instanceof Mark) ) return false;
        Mark castOther = (Mark) other;
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
