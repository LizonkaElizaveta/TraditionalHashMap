package com.hashmap.api.map;

import java.util.Map;

public class MapEntry<K, V> {

    K key;
    V value;

    public MapEntry(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public int hashCode() {
        return key.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof MapEntry<?,?>)) {
            return false;
        }
        MapEntry<K,V> item = (MapEntry<K,V>) obj;
        return key == item.key;
    }
}
