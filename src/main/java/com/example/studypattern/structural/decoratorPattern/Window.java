package com.example.studypattern.structural.decoratorPattern;

/**
 * （2）具体构件：Window, TextBox 和 ListBox
 * 窗体类：具体构件类
 */
public class Window extends Component {
    @Override
    public void display() {
        System.out.println("显示窗体!");
    }
}
