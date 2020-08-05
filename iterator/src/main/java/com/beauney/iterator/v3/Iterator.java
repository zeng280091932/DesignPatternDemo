package com.beauney.iterator.v3;

/**
 * @author zengjiantao
 * @since 2020-08-05
 */
public interface Iterator<E> {
    boolean hasNext();

    E next();
}
