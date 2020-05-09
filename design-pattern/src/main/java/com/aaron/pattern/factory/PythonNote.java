package com.aaron.pattern.factory;

import com.aaron.pattern.factory.INote;

/**
 * Python笔记
 * Created by Tom.
 */
public class PythonNote implements INote {

    @Override
    public void edit() {
        System.out.println("编写Python笔记");
    }
}
