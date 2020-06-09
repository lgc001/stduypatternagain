package com.example.studypattern.behavioral.templatemethodpattern;

public class Program {
    public static void main(String[] args) {
        System.out.println("学生甲的试卷");
        AbstractTestPaper stuA = new TestPaperA();
        stuA.exam();

        System.out.println("===================");

        System.out.println("学生乙的试卷");
        AbstractTestPaper stuB = new TestPaperB();
        stuB.exam();
    }
}
