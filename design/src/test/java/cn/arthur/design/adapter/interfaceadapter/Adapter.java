package cn.arthur.design.adapter.interfaceadapter;


/**
 * Created by arthur.
 */
public abstract class Adapter implements Target {

    protected Adaptee adaptee;
    public Adapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }

    public int request1() {
        return 0;
    }

    public int request2() {
        return 0;
    }

    public int request3() {
        return 0;
    }

    public int request4() {
        return 0;
    }
}
