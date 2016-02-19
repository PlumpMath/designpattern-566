package xwxms.middle.mediator;

/**
 * Created by Administrator on 2016/2/18.
 */
public class User1 extends User {

    public User1(Mediator mediator){
        super(mediator);
    }

    @Override
    public void work() {
        System.out.println("user1 exe!");
    }
}
