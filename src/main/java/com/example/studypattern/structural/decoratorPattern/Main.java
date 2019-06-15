package com.example.studypattern.structural.decoratorPattern;

/**
 * 背景：M公司开发部基于OO技术开发了一套图形界面构件库Visual Component，该构件库提供了大量的基本构件，如窗体、文本框、列表框等等，
 * 由于在使用该构件库时，用户经常要求定制一些特殊的显示效果，例如带滚动条的窗体，带黑色边框的文本框，即带滚动条又带黑色边框的列表框等，
 * 因此经常需要对该构件库进行扩展以增强其功能
 */
public class Main {
    public static void main(String[] args) {
        Component component = new Window();
        // 一次装饰
        Component componentSB = new ScrollBarDecorator(component);
        componentSB.display();

        // 二次装饰
        Component componentBB = new BlackBorderDecorator(component);
        componentBB.display();
    }
}
