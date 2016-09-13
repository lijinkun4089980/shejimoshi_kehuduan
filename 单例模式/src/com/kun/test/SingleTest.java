package com.kun.test;

import com.kun.source.Single;
import com.kun.source.Single2;

/**
 * Created by 阿坤 on 2016/5/17.
 */
public class SingleTest {
    public static void main(String[] args) {
        /**
         * 饿汉测试
         */
        Single single = Single.getInstance();
        Single single1 = Single.getInstance();
        if (single == single1) {
            System.out.println("饿汉是同一个...");
        }
        /**
         * 懒汉测试
         */
        Single2 single3 = Single2.getInstance();
        Single2 single4 = Single2.getInstance();
        if (single3 == single4) {
            System.out.println("懒汉是同一个...");
        }
    }
}
