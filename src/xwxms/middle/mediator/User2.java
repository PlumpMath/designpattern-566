package xwxms.middle.mediator;

/**
 * Created by Administrator on 2016/2/18.
 */
public class User2 extends User {

    public User2(Mediator mediator){
        super(mediator);
    }

    @Override
    public void work() {
        System.out.println("user2 exe!");
    }
}
