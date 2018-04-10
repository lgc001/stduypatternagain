package com.example.studypattern.structural.bridgepattern;

public class Program {
    public static void main(String[] args) {
        AbstractBridge myDriver = new SqlDriver();

        IDriver mysqlDriver = new MysqlDriver();
        myDriver.setDriver(mysqlDriver);
        myDriver.connect();

        IDriver sqlServerDriver = new SqlServerDriver();
        myDriver.setDriver(sqlServerDriver);
        myDriver.connect();
    }
}
