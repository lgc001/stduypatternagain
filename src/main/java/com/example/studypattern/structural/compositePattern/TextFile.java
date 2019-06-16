package com.example.studypattern.structural.compositePattern;

/**
 * （2）叶子构件：ImageFile、VideoFile、TextFile类
 */
public class TextFile extends AbstractFile {
    private String name;

    public TextFile(String name) {
        this.name = name;
    }

    @Override
    public void add(AbstractFile file) {
        System.out.println("对不起，系统不支持该方法！");
    }

    @Override
    public void remove(AbstractFile file) {
        System.out.println("对不起，系统不支持该方法！");
    }

    @Override
    public AbstractFile getChild(int index) {
        System.out.println("对不起，系统不支持该方法！");
        return null;
    }

    @Override
    public void killVirus() {
        // 此处模拟杀毒操作
        System.out.println(String.format("**** 对文本文件‘%s’进行杀毒", name));
    }
}
