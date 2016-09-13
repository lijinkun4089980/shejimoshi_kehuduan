package com.kun.source;

/**
 * 项目经理
 * Created by 阿坤 on 2016/9/13.
 */
public class ManagerWorker extends Worker {
    public ManagerWorker(String name) {
        super(name);
    }

    @Override
    public Boolean isNeedTime() {
        return true;
    }

    @Override
    public void work() {
        System.out.println(name + "打 LOl");
    }
}
