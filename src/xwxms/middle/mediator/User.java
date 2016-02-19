package xwxms.middle.mediator;

/**
 * Created by Administrator on 2016/2/18.
 */
public abstract class User {

    private Mediator mediator;

    public Mediator getMediator(){
        return mediator;
    }

    public User(Mediator mediator){
        this.mediator = mediator;
    }

    public abstract void work();
}
