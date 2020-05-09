package com.aaron.pattern.factory.factorymethod;

import com.aaron.pattern.factory.ICourse;
import com.aaron.pattern.factory.PythonCourse;

/**
 * Created by Tom.
 */
public class PythonCourseFactory implements ICourseFactory {

    @Override
    public ICourse create() {
        return new PythonCourse();
    }
}
