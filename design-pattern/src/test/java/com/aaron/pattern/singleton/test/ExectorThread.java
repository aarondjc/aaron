package com.aaron.pattern.singleton.test;

import com.aaron.pattern.singleton.lazy.LazyDoubleCheckSingleton;
import com.aaron.pattern.singleton.lazy.LazySimpleSingletion;
import com.aaron.pattern.singleton.threadlocal.ThreadLocalSingleton;

/**
 * Created by Tom.
 */
public class ExectorThread implements Runnable{

    public void run() {

//        LazySimpleSingletion instance = LazySimpleSingletion.getInstance();
//        LazyDoubleCheckSingleton instance = LazyDoubleCheckSingleton.getInstance();
        ThreadLocalSingleton instance = ThreadLocalSingleton.getInstance();
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(Thread.currentThread().getName() + ":" + instance);

    }
}
