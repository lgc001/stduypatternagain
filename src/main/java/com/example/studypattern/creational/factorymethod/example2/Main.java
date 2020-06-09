package com.example.studypattern.creational.factorymethod.example2;

public class Main {
    public static void main(String[] args) {
        ILoggerFactory factory = new FileLoggerFactory(); // 可通过引入配置文件实现

//        factory.createLogger().writeLog();
        ILogger logger = factory.createLogger();
        logger.writeLog();
    }
}
