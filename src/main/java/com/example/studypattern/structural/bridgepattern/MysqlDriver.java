package com.example.studypattern.structural.bridgepattern;

public class MysqlDriver implements IDriver {
    @Override
    public void connect() {
        System.out.println("连接Mysql数据库");
    }
}
