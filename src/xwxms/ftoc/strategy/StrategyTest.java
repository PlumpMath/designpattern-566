package xwxms.ftoc.strategy;

/**
 * Created by Administrator on 2016/2/17.
 * @Author:tds
 * @Description:策略模式的测试
 */
public class StrategyTest {

    public static void main(String[] args) {
        String exp = "2*8";
        ICalculator cal = new Multiply();
        int result = cal.calculate(exp);
        System.out.println(result);
    }
}
