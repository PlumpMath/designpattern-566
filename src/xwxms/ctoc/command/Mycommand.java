package xwxms.ctoc.command;

/**
 * Created by Administrator on 2016/2/18.
 */
public class Mycommand implements Command {

    private Receiver receiver;

    public Mycommand(Receiver receiver){
        this.receiver = receiver;
    }

    @Override
    public void exe() {
        receiver.action();
    }
}
