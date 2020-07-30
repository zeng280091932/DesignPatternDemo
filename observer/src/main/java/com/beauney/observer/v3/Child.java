package com.beauney.observer.v3;

/**
 * @author zengjiantao
 * @since 2020-07-30
 */
public class Child {
    private boolean cry;
    private Dad dad;

    public Child() {
        dad = new Dad();
    }

    public boolean isCry() {
        return cry;
    }

    public void wakeUp() {
        System.out.println("Child is crying.......");
        cry = true;
        dad.food();
    }
}
