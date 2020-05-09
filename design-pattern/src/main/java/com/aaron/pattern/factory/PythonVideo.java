package com.aaron.pattern.factory;

import com.aaron.pattern.factory.IVideo;

/**
 * Created by Tom.
 */
public class PythonVideo implements IVideo {
    @Override
    public void record() {
        System.out.println("录制Python视频");
    }
}
