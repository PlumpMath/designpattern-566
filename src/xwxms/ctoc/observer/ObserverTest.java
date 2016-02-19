package xwxms.ctoc.observer;

/**
 * Created by Administrator on 2016/2/17.
 * @Author:tds
 * @Description:观察者测试
 */
public class ObserverTest {

    public static void main(String[] args) {
        Subject sub = new MySubject();
        sub.add(new Observer1());
        sub.add(new Observer2());

        sub.operation();
    }
}
