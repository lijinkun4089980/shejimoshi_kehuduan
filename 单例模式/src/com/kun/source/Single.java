package com.kun.source;

/**
 * 单例模式——饿汉模式
 * Created by 阿坤 on 2016/5/17.
 */
public class Single {
    private Single() {
    }

    private static Single single = new Single();

    public static Single getInstance() {
        return single;
    }
}
