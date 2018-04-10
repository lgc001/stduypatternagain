package com.example.studypattern.structural.bridgepattern;

public abstract class AbstractBridge {

    private IDriver driver;

    public AbstractBridge(){}

    public void setDriver(IDriver driver)
    {
        this.driver=driver;
    }

    public IDriver getDriver()
    {
        return driver;
    }

    public void connect(){
        //System.out.println("基类的content");
        driver.connect();
    }
}
