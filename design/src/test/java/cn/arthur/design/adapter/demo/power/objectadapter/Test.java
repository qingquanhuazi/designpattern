package cn.arthur.design.adapter.demo.power.objectadapter;


/**
 * Created by arthur.
 */
public class Test {
    public static void main(String[] args) {
        DC5 adapter = new PowerAdapter(new AC220());
        adapter.output5V();
    }
}
