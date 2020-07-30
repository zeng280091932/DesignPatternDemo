package com.beauney.observer.v6;

/**
 * @author zengjiantao
 * @since 2020-07-30
 */
public class WakeUpEvent {
    private long time;
    private Child child;

    public WakeUpEvent(long time, Child child) {
        this.time = time;
        this.child = child;
    }

    public long getTime() {
        return time;
    }

    public Child getChild() {
        return child;
    }
}
