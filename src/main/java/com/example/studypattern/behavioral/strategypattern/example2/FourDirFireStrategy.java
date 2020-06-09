package com.example.studypattern.behavioral.strategypattern.example2;

/**
 * 四个方向开火
 */
public class FourDirFireStrategy implements FireStrategy {
    @Override
    public void fire(Tank t) {
        System.out.println(t.getName() +" 四个方向开火策略");
    }
}
