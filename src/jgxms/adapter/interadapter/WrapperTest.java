package jgxms.adapter.interadapter;

/**
 * Created by Administrator on 2016/2/15.
 * @Author:tds
 * @Description:接口适配的测试
 * 每个对象只要实现需要的方法就行了
 */
public class WrapperTest {

    public static void main(String[] args) {
        Sourceable source1 = new SourceSub1();
        Sourceable source2 = new SourceSub2();

        source1.method1();
        source1.method2();
        source2.method1();
        source2.method2();
    }
}
