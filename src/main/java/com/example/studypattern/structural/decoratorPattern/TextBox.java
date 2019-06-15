package com.example.studypattern.structural.decoratorPattern;

/**
 * （2）具体构件：Window, TextBox 和 ListBox
 * 文本框类：具体构件类
 */
public class TextBox extends Component {
    @Override
    public void display() {
        System.out.println("显示文本框!");
    }
}
