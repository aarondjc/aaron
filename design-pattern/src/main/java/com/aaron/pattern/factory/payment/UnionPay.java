package com.aaron.pattern.factory.payment;


/**
 * @author Administrator
 */
public class UnionPay extends AbstractChinaPay {
    @Override
    public void pay() {
        System.out.println("银联支付");
    }
}
