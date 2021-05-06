package cn.arthur.design.strategy.pay.payport;

/**
 * Created by arthur.
 */
public class JDPay extends Payment {
    public String getName() {
        return "京东白条";
    }

    protected double queryBalance(String uid) {
        return 500;
    }
}
