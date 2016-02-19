package xwxms.ctoc.observer;

/**
 * Created by Administrator on 2016/2/17.
 * @Author:tds
 * @Description:Observer接口实现类2
 */
public class Observer2 implements Observer {
    @Override
    public void update() {
        System.out.println("observer2 has received!");
    }
}
