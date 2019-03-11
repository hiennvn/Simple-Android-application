package com.zen8labs.mvvm;

import com.zen8labs.mvvm.dependency.component.AppComponent;
import com.zen8labs.mvvm.dependency.component.PlacesComponent;
import com.zen8labs.mvvm.dependency.component.InfoComponent;
import com.zen8labs.mvvm.dependency.module.PlacesModule;
import com.zen8labs.mvvm.dependency.module.InfoModule;

/**
 * Use to build subcomponent
 */
public class ComponentBuilder {
    private AppComponent appComponent;

    public ComponentBuilder(AppComponent appComponent) {
        this.appComponent = appComponent;
    }

    public PlacesComponent placesComponent() {
        return appComponent.plus(new PlacesModule());
    }

    public InfoComponent infoComponent() {
        return appComponent.plus(new InfoModule());
    }
}
