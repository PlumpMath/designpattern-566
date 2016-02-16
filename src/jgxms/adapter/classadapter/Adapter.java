package jgxms.adapter.classadapter;

/**
 * Created by Administrator on 2016/2/15.
 */
public class Adapter extends Source implements Targetable {
    @Override
    public void method2() {
        System.out.println("this is the targetable method!");
    }
}
