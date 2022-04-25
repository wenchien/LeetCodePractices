package com.designPatterns;

public class FactoryProvider {
    private static AbstractFactory factory;

    public static AbstractFactory getFactory(String choice) {
        if ("Animal".equals(choice)) {
            return new AnimalFactory();
        }
        // more factory object creation code

        return null;
    }
}
