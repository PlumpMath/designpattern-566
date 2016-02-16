package cjxms.factorymethod;

/**
 * Created by Administrator on 2016/2/15.
 * @Author:tds
 * @Description:工厂类创建对象实例
 */
public class SendFactory {
    public Sender produce(String type){
        if("mail".equals(type)){
            return new MailSender();
        }else if("sms".equals(type)){
            return new SmsSender();
        }else{
            System.out.println("请输入正确的类型");
            return null;
        }
    }
}
