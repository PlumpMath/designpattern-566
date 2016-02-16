package cjxms.singleton;

import java.util.Vector;

/**
 * Created by Administrator on 2016/2/15.
 * @Author:tds
 * @Description:单例模型练习
 */
public class Singletonlx {

    private static Singletonlx instance = null;
    private Vector properties = null;

    public Vector getProperties(){
        return properties;
    }

    private Singletonlx(){

    }

    private static synchronized void syninct(){
        if(instance == null){
            instance = new Singletonlx();
        }
    }

    public static Singletonlx getInstance(){
        if(instance == null){
            syninct();
        }
        return instance;
    }

    public void updateproperties(){
        Singletonlx shadow = new Singletonlx();
        properties = shadow.getProperties();
    }

}
