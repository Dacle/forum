package com.forum.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/** @author Hibernate CodeGenerator */
public class FriendrequestPK implements Serializable {

    /** identifier field */
    private BigDecimal senderid;

    /** identifier field */
    private BigDecimal receiverid;

    /** full constructor */
    public FriendrequestPK(BigDecimal senderid, BigDecimal receiverid) {
        this.senderid = senderid;
        this.receiverid = receiverid;
    }

    /** default constructor */
    public FriendrequestPK() {
    }

    public BigDecimal getSenderid() {
        return this.senderid;
    }

    public void setSenderid(BigDecimal senderid) {
        this.senderid = senderid;
    }

    public BigDecimal getReceiverid() {
        return this.receiverid;
    }

    public void setReceiverid(BigDecimal receiverid) {
        this.receiverid = receiverid;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("senderid", getSenderid())
            .append("receiverid", getReceiverid())
            .toString();
    }

    public boolean equals(Object other) {
        if ( (this == other ) ) return true;
        if ( !(other instanceof FriendrequestPK) ) return false;
        FriendrequestPK castOther = (FriendrequestPK) other;
        return new EqualsBuilder()
            .append(this.getSenderid(), castOther.getSenderid())
            .append(this.getReceiverid(), castOther.getReceiverid())
            .isEquals();
    }

    public int hashCode() {
        return new HashCodeBuilder()
            .append(getSenderid())
            .append(getReceiverid())
            .toHashCode();
    }

}
