package com.beauney.iterator.v3;

/**
 * @author zengjiantao
 * @since 2020-08-05
 */
public class ArrayList_<E> implements Collection_<E> {
    private E[] objects = (E[]) new Object[10];

    private int index;

    @Override
    public void add(E e) {
        if (index == objects.length) {
            E[] newArrays = (E[]) new Object[objects.length * 2];
            System.arraycopy(objects, 0, newArrays, 0, objects.length);
            objects = newArrays;
        }
        objects[index] = e;
        index++;
    }

    @Override
    public int size() {
        return index;
    }

    @Override
    public Iterator<E> iterator() {
        return new ArrayListIterator<E>();
    }

    private class ArrayListIterator<E> implements Iterator<E> {
        private int currentIndex;

        @Override
        public boolean hasNext() {
            return currentIndex < index;
        }

        @Override
        public E next() {
            E e = (E) objects[currentIndex];
            currentIndex++;
            return e;
        }
    }
}
