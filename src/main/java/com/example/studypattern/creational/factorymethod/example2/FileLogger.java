package com.example.studypattern.creational.factorymethod.example2;

public class FileLogger implements ILogger {
    @Override
    public void writeLog(){
        System.out.println("文件日志记录...");
    }
}
