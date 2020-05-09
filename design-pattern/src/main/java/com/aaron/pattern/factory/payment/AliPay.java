package com.aaron.pattern.factory.payment;


/**
 * @author Administrator
 */
public class AliPay extends AbstractChinaPay {
    @Override
    public void pay() {
        System.out.println("支付宝支付");
    }
}
