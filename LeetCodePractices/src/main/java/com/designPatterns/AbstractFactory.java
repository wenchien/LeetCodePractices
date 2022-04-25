package com.designPatterns;

public interface AbstractFactory<T> {
    public T create(String getType);
}
