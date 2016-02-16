package jgxms.adapter.classadapter;

/**
 * Created by Administrator on 2016/2/15.
 */
public class AdapterTest {

    public static void main(String[] args) {
        Targetable target = new Adapter();
        target.method1();
        target.method2();
    }
}
