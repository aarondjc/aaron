package com.aaron.pattern.factory.payment;

/**
 * @author Administrator
 */
public class ForeignPayFactory extends AbstractPayFactory {

    public IPay getApplePayment() {
        return new ApplePay();
    }
}
