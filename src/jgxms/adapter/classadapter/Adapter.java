package jgxms.adapter.classadapter;

/**
 * Created by Administrator on 2016/2/15.
 * @Author:tds
 * @Description:适配类继承原始类并实现目标接口中的新方法
 */
public class Adapter extends Source implements Targetable {
    @Override
    public void method2() {
        System.out.println("this is the targetable method!");
    }
}
