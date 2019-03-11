package com.zen8labs.mvvm.utils;

import android.app.Instrumentation;
import android.support.test.InstrumentationRegistry;

import com.zen8labs.mvvm.TestApplication;

public class ApplicationUtils {
    public static TestApplication application() {
        Instrumentation instrumentation = InstrumentationRegistry.getInstrumentation();
        return (TestApplication) instrumentation.getTargetContext().getApplicationContext();
    }
}
