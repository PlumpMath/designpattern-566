package jgxms.adapter.objadapter;

import jgxms.adapter.classadapter.Source;
import jgxms.adapter.classadapter.Targetable;

/**
 * Created by Administrator on 2016/2/15.
 * @Author:tds
 * @Description:对象的适配的测试
 */
public class AdapterObjTest {
    public static void main(String[] args) {
        Source source = new Source();           //创建一个对象
        Targetable target = new Wrapper(source);            //对对象进行适配
        target.method1();                       //原有的方法
        target.method2();                       //新加的方法
    }
}
