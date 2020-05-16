package com.aaron.pattern.proxy.dynamicproxy.gpproxy.client;


import com.aaron.pattern.proxy.dynamicproxy.jdkproxy.ZhaoLiu;

/**
 * Created by Tom.
 */
public class Test {
    public static void main(String[] args) {
        GpMeipo gpMeipo = new GpMeipo();
        IPerson zhangsan = gpMeipo.getInstance(new Zhangsan());
        zhangsan.findLove();


//        IPerson zhaoliu = gpMeipo.getInstance(new ZhaoLiu());
//        zhaoliu.findLove();
//        zhaoliu.buyInsure();


    }
}
