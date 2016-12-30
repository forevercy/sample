package com.cytmxk.sample;

import android.app.Application;
import android.content.Context;

/**
 * Created by chenyang on 16/6/10.
 */
public class MyApplication extends Application {

    private static Context instance;

    @Override
    public void onCreate()
    {
        instance = getApplicationContext();
    }

    public static Context getContext()
    {
        return instance;
    }
}
