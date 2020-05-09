package com.aaron.pattern.factory.payment;


/**
 * @author Administrator
 */
public class WePay extends AbstractChinaPay {
    @Override
    public void pay() {
        System.out.println("微信支付");
    }

}
