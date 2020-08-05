package com.beauney.iterator.v1;

/**
 * @author zengjiantao
 * @since 2020-08-05
 */
public class ArrayList_<E> {
    private E[] objects = (E[]) new Object[10];

    private int index;

    public void add(E e) {
        if (index == objects.length) {
            E[] newArrays = (E[]) new Object[objects.length * 2];
            System.arraycopy(objects, 0, newArrays, 0, objects.length);
            objects = newArrays;
        }
        objects[index] = e;
        index++;
    }

    public int size() {
        return index;
    }
}
