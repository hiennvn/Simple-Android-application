package com.zen8labs.biz.entity;

import com.zen8labs.core.entity.IUser;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Tom Nguyen on 12/29/2015.
 */
public class User extends RealmObject implements IUser {
    @PrimaryKey
    private String idCard;
    private String email;
    private String userName;

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
