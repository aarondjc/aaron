package com.aaron.pattern.factory;

/**
 * Created by Tom.
 */
public class PythonCourse implements ICourse {

    @Override
    public void record() {
        System.out.println("录制Python课程");
    }
}
