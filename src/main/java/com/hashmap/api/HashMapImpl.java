package com.hashmap.api;

import java.lang.reflect.Array;

public class HashMapImpl<K, V> implements TraditionalHashMap<K, V> {
    private static int ARRAY_BOUND = 16;
    private int[] array = new int[ARRAY_BOUND];
//    private V[] array = (V[]) new Object[ARRAY_BOUND];


    @Override
    public void put(K key, V value) {

        //key.hashCode() = -55555
        array[boundsIntParse(key.hashCode())] = value;
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
