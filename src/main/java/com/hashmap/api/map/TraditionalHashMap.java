package com.hashmap.api.map;

public interface TraditionalHashMap<K, V> {

    void put(K key, V value);

    V get(K key);

    boolean containsKey(K key);

    void remove(K key);

}