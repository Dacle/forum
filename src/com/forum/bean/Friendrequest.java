package com.forum.bean;

import java.io.Serializable;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/** @author Hibernate CodeGenerator */
public class Friendrequest implements Serializable {

    /** identifier field */
    private com.forum.bean.FriendrequestPK comp_id;

    /** full constructor */
    public Friendrequest(com.forum.bean.FriendrequestPK comp_id) {
        this.comp_id = comp_id;
    }

    /** default constructor */
    public Friendrequest() {
    }

    public com.forum.bean.FriendrequestPK getComp_id() {
        return this.comp_id;
    }

    public void setComp_id(com.forum.bean.FriendrequestPK comp_id) {
        this.comp_id = comp_id;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("comp_id", getComp_id())
            .toString();
    }

    public boolean equals(Object other) {
        if ( (this == other ) ) return true;
        if ( !(other instanceof Friendrequest) ) return false;
        Friendrequest castOther = (Friendrequest) other;
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
