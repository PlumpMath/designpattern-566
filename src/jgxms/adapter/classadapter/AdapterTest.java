package jgxms.adapter.classadapter;

/**
 * Created by Administrator on 2016/2/15.
 * @Author:tds
 * @Description:调用适配后的类既能调用原始类的发放也能调用新的方法
 */
public class AdapterTest {

    public static void main(String[] args) {
        Targetable target = new Adapter();
        target.method1();
        target.method2();
    }
}
