package cjxms.prototype;

import java.util.Objects;

/**
 * Created by Administrator on 2016/2/15.
 * @Author:tds
 * @Description:简单的原型类
 */
public class PrototypeSimple implements Cloneable{

    public Object clone() throws CloneNotSupportedException{
        PrototypeSimple proto = (PrototypeSimple)super.clone();
        return proto;
    }

}
