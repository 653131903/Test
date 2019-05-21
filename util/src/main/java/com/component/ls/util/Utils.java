package com.component.ls.util;

import android.app.Application;

public class Utils {
    public static Application mApplication;

    public static void init(Application application) {
        mApplication = application;
    }
}
