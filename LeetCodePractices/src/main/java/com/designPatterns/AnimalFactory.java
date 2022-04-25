package com.designPatterns;

public class AnimalFactory implements AbstractFactory<Animal>{

    @Override
    public Animal create(String getType) {
        if ("Dog".equalsIgnoreCase(getType)) {
            return new Dog();
        }
        // more object creation code
        return null;
    }
}
