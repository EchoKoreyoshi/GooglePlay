package com.example.vee.googleplay;

import android.app.Application;

import com.example.vee.googleplay.utils.UIUtil;

/**
 * 项目名： GooglePlay
 * 创建者： vee
 * 时  间： 2016/10/20
 * 描  述： 程序的入口
 */
public class BaseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        //初始化工具类
        UIUtil.init(this);
    }
}
