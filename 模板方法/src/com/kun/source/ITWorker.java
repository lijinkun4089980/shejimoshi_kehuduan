package com.kun.source;

/**
 * 程序员
 * Created by 阿坤 on 2016/9/13.
 */
public class ITWorker extends Worker {

    public ITWorker(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println(name + "写程序-测bug-fix bug");
    }
}
