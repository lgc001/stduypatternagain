package com.example.studypattern.structural.facadepattern;

public class Main {
    public static void main(String[] args) {
        EncryptFacade encryptFacade = new EncryptFacade();
        encryptFacade.fileEncrypt("Facade/src.txt", "Facade/des.txt");
    }
}
