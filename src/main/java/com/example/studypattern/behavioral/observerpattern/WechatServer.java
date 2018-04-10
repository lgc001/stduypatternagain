package com.example.studypattern.behavioral.observerpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 被观察者，也就是微信公众号服务
 * 实现了Observerable接口，对Observerable接口的三个方法进行了具体实现
 */
public class WechatServer implements IObserverable {

    //注意到这个List集合的泛型参数为Observer接口，设计原则：面向接口编程而不是面向实现编程
    private List<IObserver> observerList;
    private String message;

    public WechatServer() {
        observerList = new ArrayList<>();
    }

    @Override
    public void registerObserver(IObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (IObserver item :
                observerList) {
            item.update(message);
        }
    }

    public void setInfomation(String message) {
        this.message = message;
        System.out.println("微信服务更新消息： " + message);
        //消息更新，通知所有观察者
        notifyObservers();
    }
}
