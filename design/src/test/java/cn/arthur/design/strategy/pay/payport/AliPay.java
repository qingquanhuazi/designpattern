package cn.arthur.design.strategy.pay.payport;

/**
 * Created by arthur.
 */
public class AliPay extends Payment {
    public String getName() {
        return "支付宝";
    }

    protected double queryBalance(String uid) {
        return 900;
    }
}
