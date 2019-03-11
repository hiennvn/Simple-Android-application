package com.zen8labs.mvvm.dependency.module;

import com.zen8labs.mvvm.dependency.scope.ViewScope;
import com.zen8labs.core.model.ITestClass;
import com.zen8labs.biz.model.TestClass;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Tom Nguyen on 12/29/2015.
 */

@Module
public class TestModule {
    @Provides
    @ViewScope
    public ITestClass provideTestClass() {
        return new TestClass();
    }
}
