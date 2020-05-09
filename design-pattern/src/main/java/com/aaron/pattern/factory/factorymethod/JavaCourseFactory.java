package com.aaron.pattern.factory.factorymethod;

import com.aaron.pattern.factory.ICourse;
import com.aaron.pattern.factory.JavaCourse;

/**
 * Created by Tom.
 */
public class JavaCourseFactory implements ICourseFactory {
    @Override
    public ICourse create() {
        return new JavaCourse();
    }
}
