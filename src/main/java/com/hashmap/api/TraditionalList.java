package com.hashmap.api;

public interface TraditionalList<T> {

    void addList(T item);

    boolean contains(T item);

    void remove(T item);

}
