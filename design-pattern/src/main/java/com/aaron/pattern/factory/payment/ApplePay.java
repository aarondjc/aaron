package com.aaron.pattern.factory.payment;


/**
 * @author Administrator
 */
public class ApplePay extends AbstractForeignPay{
    @Override
    public void pay() {
        System.out.println("苹果支付");
    }

}
