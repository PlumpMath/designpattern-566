package jgxms.adapter.objadapter;

import jgxms.adapter.classadapter.Source;
import jgxms.adapter.classadapter.Targetable;

/**
 * Created by Administrator on 2016/2/15.
 */
public class AdapterObjTest {
    public static void main(String[] args) {
        Source source = new Source();
        Targetable target = new Wrapper(source);
        target.method1();
        target.method2();
    }
}
