package cn.arthur.design.factory.factorymethod;

/**
 * 功能描述：
 *
 * @author : arthur
 * @date : 2021/4/10 0010 10:58
 */
public class GreenLight implements Light{
    @Override
    public void light() {
        System.out.println("绿灯行");
    }
}
