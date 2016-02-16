package cjxms.builder;

import cjxms.abstractfactory.MailSender;
import cjxms.abstractfactory.Sender;
import cjxms.abstractfactory.SmsSender;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/2/15.
 * @Author:tds
 * @Description:建造者模式
 */
public class Builder {

    public List<Sender> list = new ArrayList<Sender>();

    public void produceMailSender(int count){
        for(int i=0;i<count;i++){
            list.add(new MailSender());
        }
    }

    public void prodiceSmsSender(int count){
        for(int i=0;i<count;i++){
            list.add(new SmsSender());
        }
    }


}
