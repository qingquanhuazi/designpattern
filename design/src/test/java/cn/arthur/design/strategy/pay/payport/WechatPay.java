package cn.arthur.design.strategy.pay.payport;

/**
 * Created by arthur.
 */
public class WechatPay extends Payment {
    public String getName() {
        return "微信支付";
    }

    protected double queryBalance(String uid) {
        return 263;
    }
}
