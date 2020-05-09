package com.aaron.pattern.factory.payment;

public abstract class AbstractChinaPay implements IPay {

    @Override
    public void init() {
        System.out.println("China Pay inited...");
    }


}
