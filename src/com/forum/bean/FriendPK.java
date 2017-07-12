package com.forum.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/** @author Hibernate CodeGenerator */
public class FriendPK implements Serializable {

    /** identifier field */
    private BigDecimal friendid;

    /** identifier field */
    private BigDecimal userid;

    /** full constructor */
    public FriendPK(BigDecimal friendid, BigDecimal userid) {
        this.friendid = friendid;
        this.userid = userid;
    }

    /** default constructor */
    public FriendPK() {
    }

    public BigDecimal getFriendid() {
        return this.friendid;
    }

    public void setFriendid(BigDecimal friendid) {
        this.friendid = friendid;
    }

    public BigDecimal getUserid() {
        return this.userid;
    }

    public void setUserid(BigDecimal userid) {
        this.userid = userid;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("friendid", getFriendid())
            .append("userid", getUserid())
            .toString();
    }

    public boolean equals(Object other) {
        if ( (this == other ) ) return true;
        if ( !(other instanceof FriendPK) ) return false;
        FriendPK castOther = (FriendPK) other;
        return new EqualsBuilder()
            .append(this.getFriendid(), castOther.getFriendid())
            .append(this.getUserid(), castOther.getUserid())
            .isEquals();
    }

    public int hashCode() {
        return new HashCodeBuilder()
            .append(getFriendid())
            .append(getUserid())
            .toHashCode();
    }

}
