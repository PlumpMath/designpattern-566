package xwxms.ctoc.observer;

/**
 * Created by Administrator on 2016/2/17.
 * @Author:tds
 * @Description:观察者接口
 */
public interface Subject {

    /*增加观察者*/
    public void add(Observer observer);

    /*删除观察者*/
    public void del(Observer observer);

    /*通知所有的观察者*/
    public void notifyObservers();

     /*自身的操作*/
    public void operation();


}
