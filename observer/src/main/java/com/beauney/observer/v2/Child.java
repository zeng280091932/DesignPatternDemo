package com.beauney.observer.v2;

/**
 * @author zengjiantao
 * @since 2020-07-30
 */
public class Child {
    private boolean cry;

    public boolean isCry() {
        return cry;
    }

    public void wakeUp() {
        System.out.println("Child is crying.......");
        cry = true;
    }
}
