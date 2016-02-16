package cjxms.builder;

/**
 * Created by Administrator on 2016/2/15.
 * @Author:tds
 * @Description:建造者模式测试
 * 建造者模式将很多功能集成到一个类里，这个类可以创造出比较复杂的东西
 */
public class BuilderList {
    public static void main(String[] args) {
        Builder builder = new Builder();
        builder.produceMailSender(10);
        builder.list.get(0).Sender();
    }
}
