package com.aaron.pattern.factory.abstractfactory;

import com.aaron.pattern.factory.INote;
import com.aaron.pattern.factory.IVideo;
import com.aaron.pattern.factory.PythonNote;
import com.aaron.pattern.factory.PythonVideo;

/**
 * Created by Tom.
 */
public class PythonCourseFactory extends CourseFactory {

    @Override
    public INote createNote() {
        super.init();
        return new PythonNote();
    }


    @Override
    public IVideo createVideo() {
        super.init();
        return new PythonVideo();
    }
}
