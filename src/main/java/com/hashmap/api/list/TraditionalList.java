package com.hashmap.api.list;

public interface TraditionalList<T> {

    void add(T item);

    T find(T item);

    boolean contains(T item);

    boolean remove(T item);

}
