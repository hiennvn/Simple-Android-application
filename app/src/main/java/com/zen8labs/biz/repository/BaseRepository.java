package com.zen8labs.biz.repository;

import io.realm.Realm;

/**
 * Created by Tom Nguyen on 12/30/2015.
 */
public class BaseRepository {
    protected Realm getRealm() {
        return Realm.getDefaultInstance();
    }
}
