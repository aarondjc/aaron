package com.aaron.pattern.factory;

import com.aaron.pattern.factory.INote;

/**
 * Java笔记
 * Created by Tom
 * @author Administrator
 */
public class JavaNote implements INote {

    @Override
    public void edit() {
        System.out.println("编写Java笔记");
    }
}
