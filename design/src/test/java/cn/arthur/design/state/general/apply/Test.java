package cn.arthur.design.state.general.apply;

/**
 * Created by arthur.
 */
public class Test {
    public static void main(String[] args) {
        Context context = new Context();
        context.setState(new ConcreteStateA());
        context.handle();
    }
}
