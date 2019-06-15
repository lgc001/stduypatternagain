package com.example.studypattern.creational.factorymethod.example2;

public class DatabaseLogger implements ILogger {
    @Override
    public void writeLog() {
        System.out.println("数据库日志记录...");
    }
}
