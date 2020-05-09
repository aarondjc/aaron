package com.aaron.pattern.factory.payment;

/**
 * @author Administrator
 */
public class ChinaPayFactory extends AbstractPayFactory {

    public IPay getAliPayment() {
        return new AliPay();
    }
    public IPay getWePayment() {
        return new WePay();
    }
    public IPay getUnionPayment() {
        return new UnionPay();
    }
}
