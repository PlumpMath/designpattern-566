package xwxms.ctoc.iterator;

/**
 * Created by Administrator on 2016/2/17.
 * @Author:tds
 * @Description:迭代子模式测试
 */
public class IteratorTest {

    public static void main(String[] args) {
        Collection collection = new MyCollection();
        Iterator it = collection.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
