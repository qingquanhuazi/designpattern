package cn.arthur.design.strategy.promotion;

/**
 * Created by arthur.
 */
public class GroupbuyStrategy implements IPromotionStrategy {
    public void doPromotion() {
        System.out.println("5人成团，可以优惠");
    }
}
