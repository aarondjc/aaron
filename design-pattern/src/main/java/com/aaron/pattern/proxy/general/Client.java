package com.aaron.pattern.proxy.general;

/**
 * Created by Tom.
 * @author Administrator
 */
public class Client {

    public static void main(String[] args) {

        Proxy proxy = new Proxy(new RealSubject());
        proxy.request();

    }

}
