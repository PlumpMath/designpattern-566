package cjxms.factorymethod;

/**
 * Created by Administrator on 2016/2/15.
 * @Author:tds
 * @Description:SMS发送方式
 */
public class SmsSender implements Sender {
    @Override
    public void Sender() {
        System.out.println("This is SMS Sender!");
    }
}
