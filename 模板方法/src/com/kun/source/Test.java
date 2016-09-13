package com.kun.source;

/**
 * Created by 阿坤 on 2016/9/13.
 */
public class Test {
    public static void main(String[] args) {
        Worker it1 = new ITWorker("阿坤");
        it1.workOneDay();
        Worker it2 = new ITWorker("阿飞");
        it2.workOneDay();
        Worker hr = new HRWorker("晓庆");
        hr.workOneDay();
        Worker qa = new QAWorker("妹子");
        qa.workOneDay();
        Worker pm = new ManagerWorker("老朱");
        pm.workOneDay();
    }
}
