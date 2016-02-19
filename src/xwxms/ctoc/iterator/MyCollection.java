package xwxms.ctoc.iterator;


/**
 * Created by Administrator on 2016/2/17.
 * @Author:tds
 * @Description:集合的接口实现
 */
public class MyCollection implements Collection {

    public String string[] = {"A","B","C","D","E"};

    @Override
    public Iterator iterator() {
        return new MyIterator(this);
    }

    @Override
    public Object get(int i) {
        return string[i];
    }

    @Override
    public int Size() {
        return string.length;
    }
}
