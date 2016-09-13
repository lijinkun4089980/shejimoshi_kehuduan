package com.kun.source.old;

/**
 * Created by 阿坤 on 2016/5/30.
 */
public class Car implements ICar {
    @Override
    public void show() {

    }

    private Underpan underpan;
    private Wheel wheel;
    private Engine engine;

    public Car(Underpan underpan, Wheel wheel, Engine engine) {
        this.underpan = underpan;
        this.wheel = wheel;
        this.engine = engine;
    }
}
