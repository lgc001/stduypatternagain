package com.example.studypattern.behavioral.strategypattern;

/**
 * Context（环境类）。负责使用算法策略，其中维持了一个抽象策略类的引用实例
 */
public class Context {
    private IShape strategy;

    public Context(IShape strategy) {
        this.strategy = strategy;
    }

    public void draw() {
        strategy.draw();
    }
}
