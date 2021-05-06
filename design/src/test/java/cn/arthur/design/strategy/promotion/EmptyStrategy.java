package cn.arthur.design.strategy.promotion;

/**
 * Created by arthur.
 */
public class EmptyStrategy implements IPromotionStrategy {
    public void doPromotion() {
        System.out.println("无优惠");
    }
}
