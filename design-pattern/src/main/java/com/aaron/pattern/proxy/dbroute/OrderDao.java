package com.aaron.pattern.proxy.dbroute;

/**
 * Created by Tom.
 * @author Administrator
 */
public class OrderDao {
    public int insert(Order order){
        System.out.println("OrderDao创建Order成功!");
        return 1;
    }
}
