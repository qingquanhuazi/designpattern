package cn.arthur.design.adapter.classadapter;

/**
 * Created by arthur.
 */
public class Test {
    public static void main(String[] args) {
        Target adapter = new Adapter();
        int result = adapter.request();
        System.out.println(result);
    }
}
