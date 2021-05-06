package cn.arthur.design.strategy.pay.payport;

/**
 * Created by arthur.
 */
public class UnionPay extends Payment {
    public String getName() {
        return "银联支付";
    }

    protected double queryBalance(String uid) {
        return 120;
    }
}
