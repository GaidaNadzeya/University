package com.company;

@FunctionalInterface
public interface Converter <T,M> {
    T convert (M obj);
}
