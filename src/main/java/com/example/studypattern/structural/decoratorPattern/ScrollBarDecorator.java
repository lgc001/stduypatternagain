package com.example.studypattern.structural.decoratorPattern;

/**
 * （4）具体装饰：ScrollBarDecorator 和 BlackBorderDecorator
 * 滚动条装饰类：具体装饰类
 */
public class ScrollBarDecorator extends ComponentDecorator {
    public ScrollBarDecorator(Component component) {
        super(component);
    }

    @Override
    public void display() {
        setScrollBar();
        super.display();
    }

    public void setScrollBar()
    {
        System.out.println("为构件增加滚动条!");
    }
}
