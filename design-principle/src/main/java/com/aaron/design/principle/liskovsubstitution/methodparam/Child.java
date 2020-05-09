package com.aaron.design.principle.liskovsubstitution.methodparam;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Tom on 2020/2/16.
 */
public class Child extends Base {
//    @Override
//    public void method(HashMap map) {
//        System.out.println("执行子类HashMap入参方法");                          测试这是中文
//        System.out.println("执行子类HashMap入参方法");System.out.println("执行子类HashMap入参方法");System.out.println("执行子类HashMap入参方法");
//    }

    public void method(Map map){
        System.out.println("执行子类Map入参方法");
    }
}
