package com.example.studypattern.structural.facadepattern;

/**
 * 数据加密类：子系统B
 */
public class CipherMachine {
    public String encrypt(String plainText)
    {
       String info ="数据加密，将明文转换为密文：";
        System.out.println(info);
        return info;
    }
}
