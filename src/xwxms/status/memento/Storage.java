package xwxms.status.memento;

/**
 * Created by Administrator on 2016/2/18.
 */
public class Storage {

    private Memento memento;

    public Storage(Memento memento){
        this.memento = memento;
    }

    public Memento getMemento(){
        return memento;
    }

    public void setMemento(Memento memento){
        this.memento = memento;
    }
}
