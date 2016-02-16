package cjxms.factorymethod2;

import cjxms.factorymethod.MailSender;
import cjxms.factorymethod.Sender;
import cjxms.factorymethod.SmsSender;

/**
 * Created by Administrator on 2016/2/15.
 * @Author:tds
 * @Description:一个方法创建对应的实例
 * 不像第一种使用字符串来区别，字符串输入错误容易导致穿件实例失败
 */
public class SenderFactory {
     public Sender produceMail(){
         return new MailSender();
     }

    public Sender produceSMS(){
        return new SmsSender();
    }
}
