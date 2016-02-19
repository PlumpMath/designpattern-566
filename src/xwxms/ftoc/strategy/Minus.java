package xwxms.ftoc.strategy;

/**
 * Created by Administrator on 2016/2/17.
 * @Author:tds
 * @Description:-号时的实现方式
 */
public class Minus extends AbstractCalculator implements ICalculator {
    @Override
    public int calculate(String exp) {
        int arrayInt[] = split(exp,"\\-");
        return arrayInt[0]-arrayInt[1];
    }
}
