package xwxms.ctoc.iterator;

/**
 * Created by Administrator on 2016/2/17.
 * @Author:tds
 * @Description:集合的接口
 */
public interface Collection {

    public Iterator iterator();

    /*取得集合元素*/
    public Object get(int i);

    /*取得集合大小*/
    public int Size();
}
