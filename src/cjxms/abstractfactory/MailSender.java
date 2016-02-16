package cjxms.abstractfactory;

/**
 * Created by Administrator on 2016/2/15.
 * @Author:tds
 * @Description:邮箱发送的实现类
 */
public class MailSender implements Sender {
    @Override
    public void Sender() {
        System.out.println("This is mail sender!");
    }
}
