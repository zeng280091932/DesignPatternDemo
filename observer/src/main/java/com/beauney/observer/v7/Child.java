package com.beauney.observer.v7;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zengjiantao
 * @since 2020-07-30
 */
public class Child implements Subject {
    private boolean cry;
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void wakeUp() {
        System.out.println("Child is crying.......");
        cry = true;
        WakeUpEvent event = new WakeUpEvent(System.currentTimeMillis(), this);
        for (Observer observer : observers) {
            observer.handleWakeEvent(event);
        }
    }
}
