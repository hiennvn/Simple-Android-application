package com.zen8labs.mvvm.dependency.component;

import javax.inject.Singleton;

import com.zen8labs.mvvm.dependency.module.AppModule;
import com.zen8labs.mvvm.dependency.module.PlacesModule;
import com.zen8labs.mvvm.dependency.module.InfoModule;
import dagger.Component;

@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {
    InfoComponent plus(InfoModule infoModule);
    PlacesComponent plus(PlacesModule placesModule);
}
