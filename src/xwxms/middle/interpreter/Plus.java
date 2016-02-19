package xwxms.middle.interpreter;


/**
 * Created by Administrator on 2016/2/18.
 */
public class Plus implements Expression {
    @Override
    public int interpret(Context context) {
        return context.getNum1() + context.getNum2();
    }
}
