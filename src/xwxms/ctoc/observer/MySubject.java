package xwxms.ctoc.observer;

/**
 * Created by Administrator on 2016/2/17.
 * @Author:tds
 * @Description:观察者实现类
 */
public class MySubject extends AbstractSubject {
    @Override
    public void operation() {
        System.out.println("update self!");
        notifyObservers();
    }
}
