package jgxms.bridge;

/**
 * Created by Administrator on 2016/2/16.
 * @Author:tds
 * @Description:定义的桥继承抽象桥
 */
public class MyBridge extends Bridge{

     public void method(){
         getSource().method();
     }
}
