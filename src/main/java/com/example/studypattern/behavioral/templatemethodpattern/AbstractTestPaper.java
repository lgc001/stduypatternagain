package com.example.studypattern.behavioral.templatemethodpattern;

public abstract class AbstractTestPaper {
    //试卷第一题
    public void testQuestion1(){
        System.out.println("小龙女是杨过的什么亲戚？() A.小姨妈 B.大姨妈 C.姑妈 D.舅妈");
        System.out.println("答案：" + answer1());
    }

    //试卷第二题
    public void testQuestion2(){
        System.out.println("全真教的首任掌门是谁？A.周伯通 B.欧阳锋 C.王重阳 D.西门吹牛");
        System.out.println("答案：" + answer2());
    }

    //试卷第三题
    public void testQuestion3(){
        System.out.println("《天龙八部》中被封为南院大王的大侠是谁？A.段誉 B.乔峰 C.慕容复 D.段智兴");
        System.out.println("答案：" + answer3());
    }

    //这三个钩子方法是给每个子类去实现，并返回答案的
    public abstract String answer1();
    public abstract String answer2();
    public abstract String answer3();

    //模板方法，考试的过程，定义基本的考试过程，子类回调
    public void exam(){
        testQuestion1();
        testQuestion2();
        testQuestion3();
    }
}
