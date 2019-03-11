package com.zen8labs.core.exception;

/**
 * Created by Tom Nguyen on 12/29/2015.
 */

/**
 * Interface to represent a wrapper around an {@link java.lang.Exception} to manage errors.
 */
public interface IErrorBundle {
    Exception getException();

    String getErrorMessage();
}
