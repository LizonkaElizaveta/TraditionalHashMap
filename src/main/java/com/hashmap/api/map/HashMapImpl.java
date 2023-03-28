package com.hashmap.api.map;

import com.hashmap.api.list.TraditionalList;
import com.hashmap.api.list.TraditionalListImpl;

import java.util.HashMap;

public class HashMapImpl<K, V> implements TraditionalHashMap<K, V> {
    private static final int ARRAY_BOUND = 16;
    private TraditionalList<MapEntry<K, V>>[] array = (TraditionalList<MapEntry<K, V>>[]) new TraditionalListImpl<?>[ARRAY_BOUND];


    public HashMapImpl() {
        for (int i = 0; i < array.length; i++) {
            TraditionalList<MapEntry<K, V>> list = new TraditionalListImpl<>();
            array[i] = list;
        }
    }


    @Override
    public void put(K key, V value) {
        MapEntry<K, V> data = new MapEntry<>(key, value);
        int index = boundsIntParse(key.hashCode());

        if (containsKey(key)) {
            array[index].remove(data);
            array[index].add(data);
        } else {
            array[index].add(data);
        }
    }

    @Override
    public V get(K key) {
        MapEntry<K, V> data = new MapEntry<>(key, null);
        int index = boundsIntParse(key.hashCode());

        if (index > array.length) {
            return null;
        }

        MapEntry<K, V> element = array[index].find(data);

        if (element != null) {
            return element.value;
        }

        return null;
    }

    @Override
    public boolean containsKey(K key) {
        MapEntry<K, V> data = new MapEntry<>(key, null);
        int index = boundsIntParse(key.hashCode());

        MapEntry<K, V> element = array[index].find(data);

        return element != null;
    }

    @Override
    public void remove(K key) {

    }

    protected int boundsIntParse(int keyHash) {
        return Math.abs(keyHash) % ARRAY_BOUND;

    }
}
