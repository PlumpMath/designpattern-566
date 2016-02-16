package cjxms.factorymethod3;

import cjxms.factorymethod.MailSender;
import cjxms.factorymethod.Sender;
import cjxms.factorymethod.SmsSender;

/**
 * Created by Administrator on 2016/2/15.
 * @Author:tds
 * @Description:静态工厂方法模式
 */
public class SenderFactory {

    public static Sender producemail(){        //创建实例直接使用静态方法
        return new MailSender();
    }

    public static  Sender produceSMS(){
        return new SmsSender();
    }
}
