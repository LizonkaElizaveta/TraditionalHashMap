package com.hashmap.api.list;

public class ListNode<T> {

    T item;
    ListNode<T> next;

    public ListNode(T value) {
        this.item = value;
    }
}

