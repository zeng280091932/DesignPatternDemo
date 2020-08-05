package com.beauney.iterator.v2;

/**
 * @author zengjiantao
 * @since 2020-08-05
 */
public class LinkedList_<E> implements Collection_<E> {
    private Node<E> head;

    private Node<E> tail;

    private int size;

    @Override
    public void add(E e) {
        Node<E> node = new Node<>(e);
        node.next = null;
        if (head == null) {
            head = node;
            tail = node;
        }

        tail.next = node;
        tail = node;
        size++;
    }

    @Override
    public int size() {
        return size;
    }

    private class Node<E> {
        E e;

        Node next;

        public Node(E e) {
            this.e = e;
        }
    }
}
