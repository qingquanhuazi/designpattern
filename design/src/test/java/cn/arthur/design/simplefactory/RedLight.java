package cn.arthur.design.simplefactory;

/**
 * 功能描述：
 *
 * @author : arthur
 * @date : 2021/4/10 0010 10:57
 */

public class RedLight implements Light{
    @Override
    public void light() {
        System.out.println("红灯停");
    }
}
