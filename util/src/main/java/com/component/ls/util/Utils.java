package com.component.ls.util;

import android.app.Application;

public class Utils {
    public static Application application;

    public void init(Application application) {
        this.application = application;
    }
}
