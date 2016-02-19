package jgxms.bridge;

/**
 * Created by Administrator on 2016/2/16.
 * @Author:tds
 * @Description:桥接模式测试
 */
public class BridgeTest {

    public static void main(String[] args) {
        Bridge bridge = new MyBridge();


        Sourceable source1 = new SourceSub1();
        bridge.setSource(source1);
        bridge.method();


        Sourceable source2 = new SourceSub2();
        bridge.setSource(source2);
        bridge.method();
    }
}
