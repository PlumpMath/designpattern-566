package xwxms.ctoc.chainresponse;

/**
 * Created by Administrator on 2016/2/18.
 */
public class MyHandler extends AbstractHandler implements Handle {

    private String name;

    public MyHandler(String name){
        this.name = name;
    }

    @Override
    public void operator() {
        System.out.println(name + "deal!");
        if(getHandle()!=null){
            getHandle().operator();
        }
    }
}
