package com.yulu.zhaoxinpeng.mysecuritycodedemo;

import android.app.Application;

import cn.smssdk.SMSSDK;

/**
 * Created by Administrator on 2017/5/9.
 */

public class SecuritycodeApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        // 启动短信验证sdk
        SMSSDK.initSDK(getApplicationContext(), "1dadd9abd13ad", "cd60d8ed2bae21faad32aed0e80b1a74");
    }
}
