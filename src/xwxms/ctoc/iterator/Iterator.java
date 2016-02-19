package xwxms.ctoc.iterator;

/**
 * Created by Administrator on 2016/2/17.
 * @Author:tds
 * @Description:迭代器的接口
 */
public interface Iterator {

    //前移
    public Object previous();

    //后移
    public Object next();
    public boolean hasNext();

    //取得第一个元素
    public Object first();
}
