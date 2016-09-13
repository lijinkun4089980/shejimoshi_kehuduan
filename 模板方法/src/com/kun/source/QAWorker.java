package com.kun.source;

/**
 * 测试
 * Created by 阿坤 on 2016/9/13.
 */
public class QAWorker extends Worker {

    public QAWorker(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println(name + "写测试用例-提交bug-写测试用例");
    }
}
