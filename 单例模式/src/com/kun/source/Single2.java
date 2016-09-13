package com.kun.source;

/**
 * 单例模式——懒汉模式
 * Created by 阿坤 on 2016/5/17.
 */
public class Single2 {
    private Single2() {
    }

    private static Single2 instance = null;

    public static Single2 getInstance() {
        if (instance == null) {
            instance = new Single2();
        }
        return instance;
    }
}
