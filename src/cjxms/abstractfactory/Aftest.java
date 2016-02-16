package cjxms.abstractfactory;

/**
 * Created by Administrator on 2016/2/15.
 * @Author:tds
 * @Description:抽象工厂模式测试
 * 如果你现在想增加一个功能：发及时信息，则只需做一个实现类，实现Sender接口，
 * 同时做一个工厂类，实现Provider接口，就OK了，无需去改动现成的代码。这样做，拓展性较好！
 */
public class Aftest {

    public static void main(String[] args) {
        Provider provider = new SenderSmsFactory();      //只需调用对应的工厂类实例化对象即可
        Sender sender = provider.produce();
        sender.Sender();
    }
}
