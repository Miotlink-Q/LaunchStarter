package com.mlink.launcher.starter.task;

public abstract class  MainTask extends Task {

    @Override
    public boolean runOnMainThread() {
        return true;
    }
}
