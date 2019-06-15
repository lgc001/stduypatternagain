package com.example.studypattern.structural.facadepattern;

/**
 * 文件读取类：子系统A
 */
public class FileReader {
    public String read(String fileNameSrc)
    {
        String info = "读取文件，获取明文：";
        System.out.println(info);

        return info;
    }
}
