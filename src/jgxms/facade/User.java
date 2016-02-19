package jgxms.facade;

/**
 * Created by Administrator on 2016/2/16.
 * @Author:tds
 * @Description:外观模型测试
 * 外观模式是为了解决类与类之家的依赖关系的
 */
public class User {

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.startup();
        computer.shutdown();
    }
}
