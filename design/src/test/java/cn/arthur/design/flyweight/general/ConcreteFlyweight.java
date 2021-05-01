package cn.arthur.design.flyweight.general;

import lombok.Data;

/**
 * 功能描述：
 *
 * @author : arthur
 * @date : 2021/5/1 0001 15:30
 */
@Data
public class ConcreteFlyweight implements IFlyweight {
    private String intrinsicState;

    public ConcreteFlyweight(String intrinsicState) {
        this.intrinsicState = intrinsicState;
    }
   @Override
    public void operation(String extrinsicState) {
        System.out.println("Object adderss:" + System.identityHashCode(this));
        System.out.println("IntrinsicState:" + this.intrinsicState);
        System.out.println("ExtrinsicState:" + extrinsicState);
    }
}
