package com.beauney.iterator.v1;

/**
 * @author zengjiantao
 * @since 2020-08-05
 */
public class LinkedList_<E> {
    private Node<E> head;

    private Node<E> tail;

    private int size;

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
