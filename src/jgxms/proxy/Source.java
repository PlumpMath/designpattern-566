package jgxms.proxy;

/**
 * Created by Administrator on 2016/2/16.
 * @Author:tds
 * @Description:需要代理的类
 */
public class Source implements Sourceable {
    @Override
    public void mehtod() {
        System.out.println("the origin method!");
    }
}
