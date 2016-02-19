package xwxms.ftoc.templatemethod;

/**
 * Created by Administrator on 2016/2/17.
 */
public class TemplateTest {

    public static void main(String[] args) {
        String exp = "8+8";
        AbstractCalculator cal = new Plus();
        int result = cal.calculate(exp,"\\+");
        System.out.println(result);
    }
}
