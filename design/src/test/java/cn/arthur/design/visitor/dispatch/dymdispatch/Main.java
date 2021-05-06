package cn.arthur.design.visitor.dispatch.dymdispatch;

/**
 * Created by arthur.
 */
public class Main {
    public static void main(String[] args) {
        Person man = new Man();
        Person woman = new WoMan();

        man.test();
        woman.test();
    }
}
