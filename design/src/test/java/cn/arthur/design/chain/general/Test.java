package cn.arthur.design.chain.general;

/**
 * Created by arthur.
 */
public class Test {
    public static void main(String[] args) {
        Handler handlerA = new ConcreteHandlerA();
        Handler handlerB = new ConcreteHandlerB();
        handlerA.setNextHanlder(handlerB);
        handlerA.handleRequest("requestB");
    }
}
