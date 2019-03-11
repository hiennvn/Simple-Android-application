package com.zen8labs.core.entity;

/**
 * Created by Tom Nguyen on 12/29/2015.
 */
public interface IUser {

    void setUserName(String userName);
    String getUserName();

    void setEmail(String email);
    String getEmail();

    void setIdCard(String idCard);
    String getIdCard();
}
