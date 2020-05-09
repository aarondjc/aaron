package com.aaron.pattern.singleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Administrator
 */
public class ContainerSingleton {

    private static Map<String, Object> cache = new ConcurrentHashMap<String, Object>();

    private ContainerSingleton() {
        throw new RuntimeException("ContainerSingleton can not be init by private...");
    }
    public static Object getInstance(String className) {
        Object instance = null;
        if (!cache.containsKey(className)) {
            synchronized (ContainerSingleton.class) {
                if (!cache.containsKey(className)) {
                    try {
                        instance = Class.forName(className).newInstance();
                        cache.put(className, instance);
                    } catch (Exception e) {
                        throw new RuntimeException("error happened when get new Instance for " + className);
                    }
                    return instance;
                } else {
                    return cache.get(className);
                }
            }
        }
        return cache.get(className);
    }
}
