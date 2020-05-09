package com.aaron.pattern.factory.abstractfactory;

import com.aaron.pattern.factory.INote;
import com.aaron.pattern.factory.IVideo;
import com.aaron.pattern.factory.JavaNote;
import com.aaron.pattern.factory.JavaVideo;

/**
 * Created by Tom.
 * @author Administrator
 */
public class JavaCourseFactory extends CourseFactory {

    @Override
    public INote createNote() {
        super.init();
        return new JavaNote();
    }

    @Override
    public IVideo createVideo() {
        super.init();
        return new JavaVideo();
    }
}
