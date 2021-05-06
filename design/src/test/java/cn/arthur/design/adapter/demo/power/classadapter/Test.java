package cn.arthur.design.adapter.demo.power.classadapter;

/**
 * Created by arthur.
 */
public class Test {
    public static void main(String[] args) {
        DC5 adapter = new PowerAdapter();
        adapter.output5V();
    }
}
