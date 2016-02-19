package xwxms.status.memento;

/**
 * Created by Administrator on 2016/2/18.
 */
public class Memento {
    private String value;

    public Memento(String value) {
       this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value){
        this.value = value;
    }
}
