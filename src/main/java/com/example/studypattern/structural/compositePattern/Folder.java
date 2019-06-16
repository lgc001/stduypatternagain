package com.example.studypattern.structural.compositePattern;

import java.util.ArrayList;
import java.util.List;

/**
 * （3）容器构件：Folder
 * 文件夹类：容器构件
 */
public class Folder extends AbstractFile {

    private List<AbstractFile> fileList = new ArrayList<>();
    private String name;

    public Folder(String name)
    {
        this.name = name;
    }

    @Override
    public void add(AbstractFile file) {
        fileList.add(file);
    }

    @Override
    public void remove(AbstractFile file) {
        fileList.remove(file);
    }

    @Override
    public AbstractFile getChild(int index) {
        return fileList.get(index);
    }

    @Override
    public void killVirus() {
        // 此处模拟杀毒操作
        System.out.println(String.format("---- 对文件夹‘%s’进行杀毒", name));
        for (AbstractFile item :
                fileList) {
            item.killVirus();
        }
    }
}
