package com.example.studypattern.structural.compositePattern;

/**
 * （1）抽象构件：AbstractFile
 * 抽象文件类：抽象构件
 */
public abstract class AbstractFile {
    public abstract void add(AbstractFile file);
    public abstract void remove(AbstractFile file);
    public abstract AbstractFile getChild(int index);
    public abstract void killVirus();
}
