package cjxms.factorymethod;

/**
 * Created by Administrator on 2016/2/15.
 * @Author:tds
 * @Description:工厂类测试类
 */
public class FactoryTest {
    public static void main(String[] args) {
        SendFactory fatory = new SendFactory();
        Sender sender = fatory.produce("sms");  //根据不同的参数到工厂类中创建不同的对象
        sender.Sender();
    }
}
