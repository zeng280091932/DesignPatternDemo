package com.beauney.iterator.v3;

/**
 * @author zengjiantao
 * @since 2020-08-05
 */
public class LinkedList_<E> implements Collection_<E> {
    private Node head;

    private Node tail;

    private int size;

    @Override
    public void add(E e) {
        Node node = new Node(e);
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

    @Override
    public Iterator<E> iterator() {
        return new LinkedListIterator();
    }

    private class LinkedListIterator implements Iterator<E> {
        private Node currentNode;

        LinkedListIterator() {
            currentNode = head;
        }

        @Override
        public boolean hasNext() {
            return currentNode != null;
        }

        @Override
        public E next() {
            Node node = currentNode;
            currentNode = node.next;
            return node.e;
        }
    }

    private class Node {
        E e;

        Node next;

        Node(E e) {
            this.e = e;
        }
    }
}
