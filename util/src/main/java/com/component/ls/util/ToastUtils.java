package com.component.ls.util;

import android.widget.Toast;

public class ToastUtils {
    public static void showToast(String s) {
        show(s);
    }

    private static void show(String s) {
        Toast.makeText(Utils.application, s, Toast.LENGTH_SHORT).show();
    }
}
