package com.hashmap.api;

public interface TraditionalList<T> {

    void add(T item);

    T get(int index);

    boolean contains(T item);

    void remove(T item);

}
