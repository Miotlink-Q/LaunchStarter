package com.mlink.application;

import android.app.Application;

import com.mlink.LoactionTask;

import com.mlink.launcher.starter.TaskDispatcher;

public class SmartApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        TaskDispatcher.init(this);
        TaskDispatcher.createInstance()
                .addTask(new LoactionTask())
                .start();
    }
}
