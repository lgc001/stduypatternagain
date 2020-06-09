package com.example.studypattern.creational.factorymethod.example3;

public class FactoryMethod {
    public static void main(String[] args) {
        ApplicationFactory factory=new ConcreteProductA();
        Product product = factory.createProduct();
        product.method();
    }
}

interface Product {
    void method();
}

class ProductA implements Product {

    @Override
    public void method() {
        System.out.println("ProductA.method excuted. ");
    }
}

class ProductA1 implements Product {

    @Override
    public void method() {
        System.out.println("ProductA1.method excuted. ");
    }
}

abstract class ApplicationFactory {
    abstract Product createProduct();
}

class ConcreteProductA extends ApplicationFactory{

    @Override
    Product createProduct() {
        return new ProductA();
    }
}

class ConcreteProductA1 extends ApplicationFactory{

    @Override
    Product createProduct() {
        return new ProductA1();
    }
}
