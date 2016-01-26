package com.yunq.gankio.injection.component;

import android.app.Application;

import com.squareup.okhttp.OkHttpClient;
import com.yunq.gankio.data.DataManager;
import com.yunq.gankio.injection.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by admin on 16/1/25.
 */
@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {
    //@ApplicationContext
  //  Context context();

    Application application();

    OkHttpClient okHttpClient();

    DataManager dataManager();


}
