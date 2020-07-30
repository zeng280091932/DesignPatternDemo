package com.beauney.observer.v5;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zengjiantao
 * @since 2020-07-30
 */
public class Child {
    private boolean cry;
    private List<Observer> observers = new ArrayList<>();

    public Child() {
        observers.add(new Dad());
        observers.add(new Mum());
        observers.add(new Dog());
    }

    public boolean isCry() {
        return cry;
    }

    public void wakeUp() {
        System.out.println("Child is crying.......");
        cry = true;
        for (Observer observer : observers) {
            observer.handleWakeEvent();
        }
    }
}
