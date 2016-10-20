package com.example.vee.googleplay.utils;

import android.app.Application;
import android.content.Context;
import android.os.Handler;

/**
 * 项目名： GooglePlay
 * 创建者： vee
 * 时  间： 2016/10/20 17:50
 * 描  述： 用来提供和资源，上下文的工具类
 */
public class UIUtil {
    private static Context mBaseContext;
    private static Handler mHandler;

    /**
     * 初始化工具类
     *
     * @param application
     */
    public static void init(Application application) {
        mBaseContext = application;
        mHandler = new Handler();
    }

    public static void post(Runnable task) {
        mHandler.post(task);
    }

    public static void postDelayed(Runnable task, long delayed){
        mHandler.postDelayed(task,delayed);


    }

    public static void removeCallbacks(Runnable task){
        mHandler.removeCallbacks(task);
    }

}

