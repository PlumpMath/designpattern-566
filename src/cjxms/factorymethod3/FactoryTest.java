package cjxms.factorymethod3;

import cjxms.factorymethod.Sender;

/**
 * Created by Administrator on 2016/2/15.
 * @Author:tds
 * @Description:工厂类测试类
 * 静态工厂方法模式不需要实例化工厂类，大多数的情况下会选用第三种
 */
public class FactoryTest {

    public static void main(String[] args) {

        Sender sender = SenderFactory.produceSMS();   //直接调用，不需要创建实例
        sender.Sender();
    }
}
