package com.aaron.pattern.factory.payment;

/**
 * @author Administrator
 */
public class PaymentTest {


    public static void main(String[] args) {
        ChinaPayFactory chinaPayFactory = new ChinaPayFactory();
        chinaPayFactory.init();
        IPay aliPay = chinaPayFactory.getAliPayment();
        IPay wePay = chinaPayFactory.getWePayment();
        IPay unionPay = chinaPayFactory.getUnionPayment();
        aliPay.init();
        aliPay.pay();

        wePay.init();
        wePay.pay();

        unionPay.init();
        unionPay.pay();

        ForeignPayFactory foreignPayFactory = new ForeignPayFactory();
        foreignPayFactory.init();
        IPay applePay = foreignPayFactory.getApplePayment();
        applePay.init();
        applePay.pay();

    }
}
