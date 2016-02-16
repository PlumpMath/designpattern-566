package cjxms.singleton;

/**
 * Created by Administrator on 2016/2/15.
 * @Author:tds
 * @Description:改进后的单例类并可以异步
 */
public class Singleton3 {

    private static Singleton3 instance = null;

    private Singleton3(){

    }

    private static synchronized void syncInit(){
        if(instance == null){
            instance = new Singleton3();
        }
    }

    public static Singleton3 getInstance(){
        if(instance == null){
            syncInit();
        }
        return instance;
    }

}
