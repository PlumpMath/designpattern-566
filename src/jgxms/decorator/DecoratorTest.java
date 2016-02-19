package jgxms.decorator;



/**
 * Created by Administrator on 2016/2/16.
 * @Author:tds
 * @Description:对象被装饰后
 * 在执行原有的方法，方法内被添加了新的内容
 */
public class DecoratorTest {
    public static void main(String[] args) {
        Sourceable source = new Source();
        Sourceable obj = new Decorator(source);
        obj.method();
    }
}
