package xwxms.status.state;

/**
 * Created by Administrator on 2016/2/18.
 */
public class State {

    private String value;

    public String getValue(){
        return value;
    }

    public void setValue(String value){
        this.value = value;
    }

   public void method1(){
       System.out.println("execute the first opt!");
   }

    public void method2(){
        System.out.println("execute the second opt!");
    }

}
