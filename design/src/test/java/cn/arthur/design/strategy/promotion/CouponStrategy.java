package cn.arthur.design.strategy.promotion;

/**
 * Created by arthur.
 */
public class CouponStrategy implements IPromotionStrategy {
    public void doPromotion() {
        System.out.println("使用优惠券抵扣");
    }
}
