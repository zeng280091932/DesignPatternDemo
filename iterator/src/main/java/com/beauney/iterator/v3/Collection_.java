package com.beauney.iterator.v3;

/**
 * @author zengjiantao
 * @since 2020-08-05
 */
public interface Collection_<E> {
    void add(E e);

    int size();

    Iterator<E> iterator();
}
