package jgxms.proxy;

/**
 * Created by Administrator on 2016/2/16.
 * @Author:tds
 * @Description:代理类
 */
public class Proxy implements Sourceable {

    private Source source;

    public Proxy(){
        super();
        this.source = new Source();
    }

    @Override
    public void mehtod() {

        before();
        source.mehtod();
        after();
    }

    private void before(){
        System.out.println("before proxy!");
    }

    private void after(){
        System.out.println("after proxy!");
    }
}
