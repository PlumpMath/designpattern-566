package jgxms.decorator;

/**
 * Created by Administrator on 2016/2/16.
 * @Author:tds
 * @Description:要求装饰对象和被装饰对象实现同一个接口
 * Source类是被装饰类，Decorator类是一个装饰类，可以为Source类动态的添加一些功能
 * 缺点：产生过多相似的对象，不易排错！
 */
public class Decorator implements Sourceable {

    private Sourceable source;
    //private Source source2;

    public Decorator (Sourceable source){
        super();
        this.source = source;
    }

    @Override
    public void method() {
        System.out.println("before decorator!");
        source.method();
        System.out.println("after decorator!");
    }
}
