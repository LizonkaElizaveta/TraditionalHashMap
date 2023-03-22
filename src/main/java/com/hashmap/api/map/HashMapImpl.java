package com.hashmap.api.map;

import com.hashmap.api.list.TraditionalList;
import com.hashmap.api.list.TraditionalListImpl;

public class HashMapImpl<K, V> implements TraditionalHashMap<K, V> {
    private static final int ARRAY_BOUND = 16;
    private TraditionalList<MapEntry<K, V>>[] array = (TraditionalList<MapEntry<K, V>>[]) new TraditionalListImpl<?>[ARRAY_BOUND];


    @Override
    public void put(K key, V value) {
        MapEntry<K, V> data = new MapEntry<>(key, value);
        TraditionalList<MapEntry<K, V>> list = new TraditionalListImpl<>();
        array[boundsIntParse(key.hashCode())] = list;
        list.add(data);
    }

    @Override
    public V get(K key) {
        return null;
    }

    @Override
    public boolean containsKey(K key) {
        return false;
    }

    @Override
    public void remove(K key) {

    }

    protected int boundsIntParse(int keyHash) {
        return Math.abs(keyHash) % ARRAY_BOUND;

    }
}
