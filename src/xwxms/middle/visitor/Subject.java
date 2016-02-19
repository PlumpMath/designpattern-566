package xwxms.middle.visitor;

/**
 * Created by Administrator on 2016/2/18.
 */
public interface Subject {

    public void accept(Visitor visitor);
    public String getSubject();
}
