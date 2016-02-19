package xwxms.ctoc.chainresponse;

/**
 * Created by Administrator on 2016/2/18.
 */
public abstract class AbstractHandler {

    private Handle handle;

    public Handle getHandle(){
        return handle;
    }

    public void setHandle(Handle handle){
        this.handle = handle;
    }
}
