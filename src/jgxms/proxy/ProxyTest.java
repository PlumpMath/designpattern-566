package jgxms.proxy;

/**
 * Created by Administrator on 2016/2/16.
 * @Author:tds
 * @Description:直接将事务委托给代理
 */
public class ProxyTest {

    public static void main(String[] args) {
        Sourceable source = new Proxy();
        source.mehtod();
    }
}
