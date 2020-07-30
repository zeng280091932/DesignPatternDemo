package com.beauney.observer.v7;

/**
 * @author zengjiantao
 * @since 2020-07-30
 */
public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        child.addObserver(new Dad());
        child.addObserver(new Mum());
        child.addObserver(new Dog());
        child.wakeUp();
    }
}
