package com.kun.source;

import java.util.Date;

/**
 * 来个超类，超类中定义了一个workOneDay方法，设置为作为算法的骨架
 * Created by 阿坤 on 2016/9/13.
 */
public abstract class Worker {

    protected String name;

    public Worker(String name) {
        this.name = name;
    }

    public Boolean isNeedTime() {
        return false;
    }

    /**
     * 记录一天的工作
     */
    public final void workOneDay() {
        System.out.println("-----------------work start ---------------");
        enterCompany();
        computerOn();
        work();
        computerOff();
        exitCompany();
        System.out.println("-----------------work end ---------------");
    }

    /**
     * 进入公司
     */
    public void enterCompany() {
        System.out.println(name + "进入公司");
    }

    /**
     * 打开电脑
     */
    private void computerOn() {
        System.out.println(name + "打开电脑");
    }

    /**
     * 工作
     */
    public abstract void work();

    /**
     * 关闭电脑
     */
    private void computerOff() {
        System.out.println(name + "关闭电脑");
    }

    /**
     * 离开公司
     */
    public void exitCompany() {
        if (isNeedTime()) {
            System.out.println(name + new Date().toLocaleString() + "离开公司");
        } else {
            System.out.println(name + "离开公司");
        }
    }
}
