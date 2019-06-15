package com.example.studypattern.structural.decoratorPattern;

/**
 * （3）抽象装饰：ComponentDecorator
 * 构件装饰类：抽象装饰类
 */
public class ComponentDecorator extends Component {
    private Component component;

    public ComponentDecorator(Component component)
    {
        this.component = component;
    }

    @Override
    public void display() {
        component.display();
    }
}
