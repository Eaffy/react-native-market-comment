package com.eaffy.rnmarketcomment;

import android.net.Uri;
import android.content.pm.PackageManager;
import android.content.Intent;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import java.util.Map;

public class RNMarketCommentModule extends ReactContextBaseJavaModule {

    ReactApplicationContext reactContext;

    public RNMarketCommentModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @Override
    public String getName() {
        return "RNMarketCommentModule";
    }

    @ReactMethod
    public void show() {
        Uri uri = Uri.parse("market://details?id=" + reactContext.getPackageName());
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        reactContext.startActivity(intent);
    }
}
