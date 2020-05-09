package com.aaron.pattern.factory.payment;

public abstract class AbstractForeignPay implements IPay {

    @Override
    public void init() {
        System.out.println("Foreign Pay inited...");
    }


}
