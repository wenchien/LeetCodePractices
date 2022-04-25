package com.designPatterns;

public class DesignPatterns {
    // this is the client class
    public static void main(String[] args) {
        Animal a = (Animal) FactoryProvider.getFactory("Animal").create("Dog");
    }
}
