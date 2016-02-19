package xwxms.ctoc.command;

/**
 * Created by Administrator on 2016/2/18.
 */
public class Invoker {

    private Command command;

    public Invoker(Command command){
        this.command = command;
    }

    public void action(){
        command.exe();
    }
}
