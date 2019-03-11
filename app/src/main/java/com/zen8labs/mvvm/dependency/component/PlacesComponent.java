package com.zen8labs.mvvm.dependency.component;

import com.zen8labs.mvvm.dependency.module.PlacesModule;
import com.zen8labs.mvvm.dependency.scope.ViewScope;
import com.zen8labs.mvvm.view.fragment.PlacesFragment;
import dagger.Subcomponent;

@ViewScope
@Subcomponent(modules = {PlacesModule.class})
public interface PlacesComponent {
    void inject(PlacesFragment placesFragment);
}
