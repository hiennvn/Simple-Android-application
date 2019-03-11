package com.zen8labs.mvvm.dependency.component;

import com.zen8labs.mvvm.dependency.module.InfoModule;
import com.zen8labs.mvvm.dependency.module.TestModule;
import com.zen8labs.mvvm.dependency.scope.ViewScope;
import com.zen8labs.mvvm.view.activity.InfoActivity;
import dagger.Subcomponent;

@ViewScope
@Subcomponent(modules = {InfoModule.class, TestModule.class})
public interface InfoComponent {
    void inject(InfoActivity infoActivity);
}
