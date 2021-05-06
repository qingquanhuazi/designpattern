package cn.arthur.design.adapter.classadapter;

/**
 * Created by arthur.
 */
public class Adapter extends Adaptee implements Target {
    public int request() {
        return super.specificRequest() / 10;
    }
}
