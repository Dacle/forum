package com.forum.bean;

import java.io.Serializable;
import java.sql.Clob;
import java.util.Date;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/** @author Hibernate CodeGenerator */
public class Friend implements Serializable {

    /** identifier field */
    private com.forum.bean.FriendPK comp_id;

    /** persistent field */
    private String username;

    /** persistent field */
    private String friendname;

    /** persistent field */
    private Date adddate;

    /** nullable persistent field */
    private Clob message;

    /** full constructor */
    public Friend(com.forum.bean.FriendPK comp_id, String username, String friendname, Date adddate, Clob message) {
        this.comp_id = comp_id;
        this.username = username;
        this.friendname = friendname;
        this.adddate = adddate;
        this.message = message;
    }

    /** default constructor */
    public Friend() {
    }

    /** minimal constructor */
    public Friend(com.forum.bean.FriendPK comp_id, String username, String friendname, Date adddate) {
        this.comp_id = comp_id;
        this.username = username;
        this.friendname = friendname;
        this.adddate = adddate;
    }

    public com.forum.bean.FriendPK getComp_id() {
        return this.comp_id;
    }

    public void setComp_id(com.forum.bean.FriendPK comp_id) {
        this.comp_id = comp_id;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFriendname() {
        return this.friendname;
    }

    public void setFriendname(String friendname) {
        this.friendname = friendname;
    }

    public Date getAdddate() {
        return this.adddate;
    }

    public void setAdddate(Date adddate) {
        this.adddate = adddate;
    }

    public Clob getMessage() {
        return this.message;
    }

    public void setMessage(Clob message) {
        this.message = message;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("comp_id", getComp_id())
            .toString();
    }

    public boolean equals(Object other) {
        if ( (this == other ) ) return true;
        if ( !(other instanceof Friend) ) return false;
        Friend castOther = (Friend) other;
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
