package xwxms.ctoc.observer;

/**
 * Created by Administrator on 2016/2/17.
 * @Author:tds
 * @Description:Observer接口实现类1
 */
public class Observer1 implements Observer {
    @Override
    public void update() {
        System.out.println("observer1 has received！");
    }
}
