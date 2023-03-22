package com.hashmap.api.map;

public class MapEntry<K, V> {

    K key;
    V value;

    public MapEntry(K key, V value) {
        this.key = key;
        this.value = value;
    }
}
