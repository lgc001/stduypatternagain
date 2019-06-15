package com.example.studypattern.creational.factorymethod.example2;

public class DatabaseLoggerFactory implements ILoggerFactory {
    @Override
    public ILogger createLogger() {
        return new DatabaseLogger();
    }
}
