package xwxms.middle.visitor;

/**
 * Created by Administrator on 2016/2/18.
 */
public class VisitorTest {

    public static void main(String[] args) {

        Visitor visitor = new MyVisitor();
        Subject subject = new MySubject();
        subject.accept(visitor);
    }

}
