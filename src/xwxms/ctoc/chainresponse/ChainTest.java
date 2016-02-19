package xwxms.ctoc.chainresponse;

/**
 * Created by Administrator on 2016/2/18.
 */
public class ChainTest {

    public static void main(String[] args) {
        MyHandler h1 = new MyHandler("h1");
        MyHandler h2 = new MyHandler("h2");
        MyHandler h3 = new MyHandler("h3");

        h1.setHandle(h2);
        h2.setHandle(h3);

        h1.operator();
    }
}
