package com.hashmap.api.list;

public class TraditionalListImpl<T> implements TraditionalList<T> {

    private ListNode<T> head;
    private ListNode<T> tail;
    private ListNode<T> previous;

    @Override
    public void add(T item) {
        ListNode<T> element = new ListNode<T>(item);

        if (tail == null) {
            head = element;
        } else {
            tail.next = element;
        }
        tail = element;
    }

    @Override
    public T find(T item) {
        ListNode<T> element = head;

        while (element != null) {

            if (element.item.hashCode() == item.hashCode() && element.item.equals(item)) {
                return element.item;
            }

            element = element.next;

        }

        return null;
    }

    @Override
    public boolean contains(T item) {
        ListNode<T> element = head;

        while (element != null) {

            if (element.item.equals(item)) {
                return true;
            }

            element = element.next;

        }

        return false;
    }

    @Override
    public boolean remove(T item) {
        ListNode<T> current = head;

        while (current != null) {

            if (current.item.equals(item)) {

                if (previous == null) {
                    // element is in the start
                    head = head.next;

                    if (head == null) {
                        // the list is empty
                        tail = null;
                    }
                } else {
                    // element is in the middle
                    previous.next = current.next;

                    if (current.next == null) {
                        // element is in the end
                        tail = previous;
                    }
                }

                return true;

            } else {
                previous = current;
                current = current.next;
            }
        }
        return false;

    }
}
