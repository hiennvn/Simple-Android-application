package com.zen8labs.core.repository;

import com.zen8labs.core.entity.IUser;

import java.util.List;

import rx.Observable;

/**
 * Created by Tom Nguyen on 12/29/2015.
 */
public interface IUserRepository extends IRepository<IUser> {
    String customMethod();
}
