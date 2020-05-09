package com.aaron.pattern.factory.payment;

/**
 * @author Administrator
 * 跨境支付，支付宝、微信、银联支付
 */
public interface IPay {

    /**
     * 初始化
     */
    void init();

    /**
     * 支付
     */
    void pay();

}
