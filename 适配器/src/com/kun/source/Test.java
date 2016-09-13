package com.kun.source;

/**
 * Created by 阿坤 on 2016/9/13.
 */
public class Test {
    public static void main(String[] args) {
        Mobile mobile = new Mobile();
        V5Power v5Power = new V5PowerAdapter(new V220Power());
        //V5Power v5Power = new V5Power() {
        //    @Override
        //    public int provideV5Power() {
        //        return 5;
        //    }
        //};
        mobile.inputPower(v5Power);
    }
}
