package com.example.studypattern.creational.factorymethod.example2;

public class FileLoggerFactory implements ILoggerFactory {
    @Override
    public ILogger createLogger() {
        return new FileLogger();
    }
}
