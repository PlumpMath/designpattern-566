package xwxms.middle.mediator;

/**
 * Created by Administrator on 2016/2/18.
 */
public class MediatorTest {

    public static void main(String[] args) {
        Mediator mediator = new MyMediator();
        mediator.createMediator();
        mediator.workAll();
    }
}
