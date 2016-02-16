package cjxms.singleton;

/**
 * Created by Administrator on 2016/2/15.
 * @Author:tds
 * @Description:改进后的单例类
 */
public class Singleton2 {

    /*私有化构造方法，防止被实例化*/
    private Singleton2(){

    }

    /*使用一个内部类来维护单例*/
    private static class SingletonFactory{
        private static Singleton2 instance = new Singleton2();
    }

    /*获取实例*/
    public static Singleton2 getInstance(){
        return SingletonFactory.instance;
    }

    /*如果该对象呗拥有序列化，可以保证对象在序列化前后保持一致*/
    public Object readResolve(){
        return getInstance();
    }

}
