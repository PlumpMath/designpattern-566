package cjxms.abstractfactory;

/**
 * Created by Administrator on 2016/2/15.
 * @Author:tds
 * @Description:邮箱发送方式的工厂类
 */
public class SenderMailFactory implements Provider {
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
