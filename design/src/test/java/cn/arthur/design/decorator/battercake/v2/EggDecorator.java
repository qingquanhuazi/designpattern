package cn.arthur.design.decorator.battercake.v2;

/**
 * Created by arthur.
 */
public class EggDecorator extends BattercakeDecorator{

    public EggDecorator(Battercake battercake) {
        super(battercake);
    }

    protected String getMsg(){ return super.getMsg() + "1个鸡蛋";}

    public int getPrice(){ return super.getPrice() + 1;}

}
