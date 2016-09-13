package com.kun.source;

/**
 * Created by 阿坤 on 2016/9/13.
 */
public class V5PowerAdapter implements V5Power {

    /**
     * 组合的方式
     */
    private V220Power v220Power;

    public V5PowerAdapter(V220Power v220Power) {
        this.v220Power = v220Power;
    }

    @Override
    public int provideV5Power() {
        int power = v220Power.provideV220Power();
        /*逻辑代码*/
        System.out.println("适配器：我改变了伏数.");
        power = 5;
        return power;
    }
}
