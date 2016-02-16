package cjxms.singleton;

import java.util.Vector;

/**
 * Created by Administrator on 2016/2/15.
 * @Author:tds
 * @Description:简单的单例类之影子实例
 */
public class Singleton4 {

    private static Singleton4 instance = null;
    private Vector properties = null;

    public Vector getProperties(){
        return properties;
    }

    private Singleton4(){

    }

    private static synchronized void syncInit(){
        if(instance == null){
            instance = new Singleton4();
        }
    }

    public static Singleton4 getInstance(){
        if(instance == null){
            syncInit();
        }
        return instance;
    }

    public void updateProperties(){
        Singleton4 shadow = new Singleton4();     //实例化新的实例，将新的属性赋上去
        properties = shadow.getProperties();
    }

}
