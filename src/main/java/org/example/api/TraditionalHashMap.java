package org.example.api;

public interface TraditionalHashMap<K, V> {

    void put(K key, V value);

    V get(K key);

    boolean containsKey(K key);

    boolean containsValue(K value);

    V remove(K key);

}