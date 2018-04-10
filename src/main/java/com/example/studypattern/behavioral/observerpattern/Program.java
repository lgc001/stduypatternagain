package com.example.studypattern.behavioral.observerpattern;

public class Program {
    public static void main(String[] args){

        IObserver userA = new User("li");
        IObserver userB = new User("bb");
        IObserver userC = new User("haha");

        WechatServer wechat=new WechatServer();
        wechat.registerObserver(userA);
        wechat.registerObserver(userB);
        wechat.registerObserver(userC);
        wechat.setInfomation("明天就要上班了");

        System.out.println("-------------------");

        wechat.removeObserver(userB);
        wechat.setInfomation("今天天气不错啊");
    }
}
