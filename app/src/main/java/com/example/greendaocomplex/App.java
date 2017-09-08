package com.example.greendaocomplex;


import android.app.Application;

import com.example.greendaocomplex.data.local.database.model.DaoMaster;
import com.example.greendaocomplex.data.local.database.model.DaoSession;
import com.facebook.stetho.Stetho;

import org.greenrobot.greendao.database.Database;

public class App extends Application {
    DaoSession daoSession;


    @Override
    public void onCreate() {
        super.onCreate();

        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(this, "plants-db");
        Database db = helper.getWritableDb();
        daoSession = new DaoMaster(db).newSession();

        if (BuildConfig.DEBUG) {
            //Empty cache
            daoSession.clear();

            initializeStetho();
        }

    }

    public DaoSession getDaoSession() {
        return daoSession;
    }

    private void initializeStetho() {
        // Create an InitializerBuilder
        Stetho.InitializerBuilder initializerBuilder = Stetho.newInitializerBuilder(this);

        // Enable Chrome DevTools
        initializerBuilder.enableWebKitInspector(Stetho.defaultInspectorModulesProvider(this));

        // Enable command line interface
        initializerBuilder.enableDumpapp(Stetho.defaultDumperPluginsProvider(this));

        // Use the InitializerBuilder to generate an Initializer
        Stetho.Initializer initializer = initializerBuilder.build();

        // Initialize Stetho with the Initializer
        Stetho.initialize(initializer);
    }
}
