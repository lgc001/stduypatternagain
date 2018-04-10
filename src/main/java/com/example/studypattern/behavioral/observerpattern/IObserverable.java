package com.example.studypattern.behavioral.observerpattern;

/***
 * 抽象被观察者接口
 * 声明了添加、删除、通知观察者方法
 */
public interface IObserverable {
    void registerObserver(IObserver observer);
    void removeObserver(IObserver observer);
    void notifyObservers();
}
