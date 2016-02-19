package jgxms.bridge;

/**
 * Created by Administrator on 2016/2/16.
 * @Author:tds
 * @Description:定义一个桥
 * 持有Sourceable的一个实例
 */
public abstract class Bridge {

    private Sourceable source;

    public void method(){
        source.method();
    }

    public Sourceable getSource(){
        return source;
    }

    public void setSource(Sourceable source){
        this.source = source;
    }
}
