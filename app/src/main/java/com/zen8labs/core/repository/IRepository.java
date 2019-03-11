package com.zen8labs.core.repository;

import java.util.List;

/**
 * Created by Tom Nguyen on 12/30/2015.
 */
public interface IRepository<TEntity> {
    List<TEntity> getAll();

    TEntity get(Object[] keys);

    TEntity create(TEntity entity);

    TEntity update(TEntity entity);

    TEntity delete(TEntity entity);
}
