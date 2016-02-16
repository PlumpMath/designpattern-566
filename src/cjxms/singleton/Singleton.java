package cjxms.singleton;

/**
 * Created by Administrator on 2016/2/15.
 * @Author:tds
 * @Description:简单的单例类
 */
public class Singleton {

    /*持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载*/
    private static Singleton instance = null;

    /*私有构造方法，防止被实例化*/
    private Singleton(){

    }

    /*静态工程方法，创建实例*/
   /* public static  Singleton getInstance(){  //没有线程保护，如果放入多线程中，肯定会出现问题
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }*/

    /*public static synchronized Singleton getInstance(){  //添加synchronized关键字锁住了这个对象，但效率很低
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }*/

    public static Singleton getInstance(){  //由于java指令中创建创建对象和赋值操作是分开，JVM不能保证先后顺序
        if (instance == null){
            synchronized (instance){
                if (instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    /*如果该对象被用于序列化，可以保证对象在序列化前后保持一致*/
    public Object readResolve(){
        return instance;
    }
}
