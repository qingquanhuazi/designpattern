package cn.arthur.design.adapter.demo.power.interfaceadapter;


/**
 * Created by arthur.
 */
public class Test {
    public static void main(String[] args) {
        DC adapter = new PowerAdapter(new AC220());
        adapter.output5V();
    }
}
