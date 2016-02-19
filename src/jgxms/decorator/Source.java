package jgxms.decorator;

/**
 * Created by Administrator on 2016/2/16.
 * @Author:tds
 * @Description:被装饰的类
 * 已有一个方法
 */
public class Source implements Sourceable {
    @Override
    public void method() {
        System.out.println("the original method!");
    }
}
