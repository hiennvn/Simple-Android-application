package com.zen8labs.mvvm;


import com.zen8labs.mvvm.dependency.component.AppComponent;

public class TestApplication extends MyApplication {
    public void setComponent(AppComponent appComponent) {
        this.mAppComponent = appComponent;
    }

    public void setComponentBuilder(ComponentBuilder componentBuilder) {
        this.mComponentBuilder = componentBuilder;
    }
}
