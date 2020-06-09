package com.example.studypattern.behavioral.strategypattern.example2;

public class Program {
    public static void main(String[] args) {
        Tank tank = new Tank("tanke 1");
        tank.fire(new DefaultFireStrategy());

        tank.fire(new FourDirFireStrategy());
    }
}
