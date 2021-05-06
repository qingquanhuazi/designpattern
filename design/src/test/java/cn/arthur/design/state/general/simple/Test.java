package cn.arthur.design.state.general.simple;

/**
 * Created by arthur.
 */
public class Test {
    public static void main(String[] args) {
        Context context = new Context();
        context.setState(new ConcreteStateB());
        context.handle();
    }
}
