package cn.arthur.design.decorator.battercake.v1;

/**
 * Created by arthur.
 * 继承实现装饰，继承链路过长
 */
public class Test {

    public static void main(String[] args) {
        Battercake battercake = new Battercake();
        System.out.println(battercake.getMsg() + ",总价：" + battercake.getPrice());

        BattercakeWithEgg battercakeWithEgg = new BattercakeWithEgg();
        System.out.println(battercakeWithEgg.getMsg() + ",总价：" + battercakeWithEgg.getPrice());

        BattercakeWithEggAndSauage battercakeWithEggAndSauage = new BattercakeWithEggAndSauage();
        System.out.println(battercakeWithEggAndSauage.getMsg() + ",总价：" + battercakeWithEggAndSauage.getPrice());
    }

}
