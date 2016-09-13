package com.kun.source.old;

/**
 * Created by 阿坤 on 2016/5/17.
 */

public class OldClient {
    public static void main(String[] args) {
        Engine engine = new Engine();
        Underpan underpan = new Underpan();
        Wheel wheel = new Wheel();
        ICar car = new Car(underpan, wheel, engine);
        car.show();
    }
}
