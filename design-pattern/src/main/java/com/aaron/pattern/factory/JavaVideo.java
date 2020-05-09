package com.aaron.pattern.factory;


import com.aaron.pattern.factory.IVideo;

/**
 * Created by Tom on.
 */
public class JavaVideo implements IVideo {
    @Override
    public void record() {
        System.out.println("录制Java视频");
    }
}
