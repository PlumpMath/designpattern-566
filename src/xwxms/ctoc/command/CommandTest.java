package xwxms.ctoc.command;

/**
 * Created by Administrator on 2016/2/18.
 */
public class CommandTest {

    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command cmd = new Mycommand(receiver);
        Invoker invoker = new Invoker(cmd);
        invoker.action();
    }
}
