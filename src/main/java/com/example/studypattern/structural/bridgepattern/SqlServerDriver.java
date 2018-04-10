package com.example.studypattern.structural.bridgepattern;

public class SqlServerDriver implements IDriver {
    @Override
    public void connect() {
        System.out.println("连接SQLServer数据库");
    }
}
