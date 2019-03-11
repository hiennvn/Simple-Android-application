package com.zen8labs.mvvm.dependency.module;

import com.google.gson.Gson;
import com.zen8labs.biz.repository.UserRepository;
import com.zen8labs.core.repository.IUserRepository;
import com.zen8labs.mvvm.MyApplication;
import com.zen8labs.mvvm.dependency.scope.ViewScope;
import com.zen8labs.core.service.IInfoService;
import com.zen8labs.biz.service.InfoService;
import com.zen8labs.core.viewmodel.IInfoViewModel;
import com.zen8labs.biz.viewmodel.InfoViewModel;
import dagger.Module;
import dagger.Provides;
import io.realm.Realm;

@Module
public class InfoModule {
    @Provides
    @ViewScope
    public IInfoService provideInfoService(Gson gson, IUserRepository repository) {
        return new InfoService(gson, repository);
    }

    @Provides
    @ViewScope
    public IInfoViewModel provideInfoViewModel(IInfoService infoService) {
        return new InfoViewModel(infoService);
    }
}
