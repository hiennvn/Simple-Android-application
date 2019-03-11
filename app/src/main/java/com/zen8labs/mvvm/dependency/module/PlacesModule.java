package com.zen8labs.mvvm.dependency.module;

import com.zen8labs.mvvm.dependency.scope.ViewScope;
import com.zen8labs.core.api.IPlacesApi;
import com.zen8labs.utils.RetrofitUtils;
import com.zen8labs.core.viewmodel.IPlacesViewModel;
import com.zen8labs.biz.viewmodel.PlacesViewModel;
import dagger.Module;
import dagger.Provides;

@Module
public class PlacesModule {
    @Provides
    @ViewScope
    public IPlacesApi providePlacesApi() {
        return RetrofitUtils.create(IPlacesApi.class, "https://maps.googleapis.com/maps/api/place/");
    }

    @Provides
    @ViewScope
    public IPlacesViewModel providePlacesViewModel(IPlacesApi placesApi) {
        return new PlacesViewModel(placesApi);
    }
}