package jgxms.adapter.objadapter;

import jgxms.adapter.classadapter.Source;
import jgxms.adapter.classadapter.Targetable;

/**
 * Created by Administrator on 2016/2/15.
 * @Author:tds
 * @Description:对象的适配
 * 不继承类直接实现方法
 */
public class Wrapper implements Targetable {

    private Source source;

    public Wrapper(Source source){
        super();                  //??
        this.source = source;
    }

    @Override
    public void method1() {
        source.method1();
    }

    @Override
    public void method2() {
        System.out.println("this is the obj targetable method!");
    }
}
