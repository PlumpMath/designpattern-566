package xwxms.middle.visitor;


/**
 * Created by Administrator on 2016/2/18.
 */
public class MyVisitor implements Visitor {
    @Override
    public void visit(Subject sub) {
        System.out.println("visit the subject :" + sub.getSubject());
    }
}
