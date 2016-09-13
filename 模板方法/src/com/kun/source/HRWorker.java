package com.kun.source;

/**
 * HR
 * Created by 阿坤 on 2016/9/13.
 */
public class HRWorker extends Worker {
    public HRWorker(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println(name + "看简历-打电话-接电话");
    }
}
