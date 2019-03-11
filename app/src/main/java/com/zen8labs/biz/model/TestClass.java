package com.zen8labs.biz.model;

import com.zen8labs.core.model.ITestClass;

/**
 * Created by Tom Nguyen on 12/29/2015.
 */
public class TestClass implements ITestClass {
    public int plusOne(int a) {
        return  ++a;
    }
}
