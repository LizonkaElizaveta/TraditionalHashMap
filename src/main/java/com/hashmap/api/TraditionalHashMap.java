package com.hashmap.api;

public interface TraditionalHashMap<K, V> {

    void put(K key, V value);

    V get(K key);

    boolean containsKey(K key);

    V remove(K key);

}