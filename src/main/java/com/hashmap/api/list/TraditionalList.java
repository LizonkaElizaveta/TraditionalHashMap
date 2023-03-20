package com.hashmap.api.list;

public interface TraditionalList<T> {

    void add(T item);

    T get(int index);

    boolean contains(T item);

    boolean remove(T item);

}
