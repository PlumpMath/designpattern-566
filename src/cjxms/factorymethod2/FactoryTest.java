package cjxms.factorymethod2;

import cjxms.factorymethod.Sender;

/**
 * Created by Administrator on 2016/2/15.
 * @Author:tds
 * @Description:工厂类测试类2
 */
public class FactoryTest {
    public static void main(String[] args) {
        SenderFactory factory = new SenderFactory();
        Sender sender = factory.produceSMS();     //只需调用不同的创建实例的方法即可，这样就可以避免输错字符串导致程序错误
        sender.Sender();
    }
}
