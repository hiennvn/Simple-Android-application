package com.zen8labs.biz.factory;

import com.zen8labs.core.repository.IRepository;

/**
 * Created by Tom Nguyen on 12/29/2015.
 */

public class RepositoryFactory {
    public static <TEntity, TRepository extends IRepository<TEntity>> TRepository getRepository(Class<TRepository> repository) {
        try {
            return repository.newInstance();
        } catch (InstantiationException e) {

        } catch (IllegalAccessException e){

        }

        return null;
    }
}
