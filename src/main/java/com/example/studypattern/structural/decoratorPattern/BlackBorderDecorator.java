package com.example.studypattern.structural.decoratorPattern;

/**
 * （4）具体装饰：ScrollBarDecorator 和 BlackBorderDecorator
 * 黑色边框装饰类：具体装饰类
 */
public class BlackBorderDecorator extends ComponentDecorator {
    public BlackBorderDecorator(Component component) {
        super(component);
    }

    @Override
    public void display() {
        setScrollBar();
        super.display();
    }

    public void setScrollBar()
    {
        System.out.println("为构件增加黑色边框!");
    }
}
