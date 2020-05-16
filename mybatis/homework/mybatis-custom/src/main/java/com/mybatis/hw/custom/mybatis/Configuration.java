package com.mybatis.hw.custom.mybatis;

import java.lang.reflect.Proxy;
import java.util.ResourceBundle;

/**
 * @author Administrator
 */
public class Configuration {

    public static final ResourceBundle sqlMappings;

    static{
        sqlMappings = ResourceBundle.getBundle("sql");
    }

    public <T> T getMapper(Class clazz, SqlSession sqlSession) {
        return (T) Proxy.newProxyInstance(this.getClass().getClassLoader(),
                new Class[]{clazz},
                new MapperProxy(sqlSession));
    }

}
