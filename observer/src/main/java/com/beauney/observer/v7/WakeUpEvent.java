package com.beauney.observer.v7;

/**
 * @author zengjiantao
 * @since 2020-07-30
 */
public class WakeUpEvent {
    private long time;
    private Subject source;

    public WakeUpEvent(long time, Subject source) {
        this.time = time;
        this.source = source;
    }

    public long getTime() {
        return time;
    }

    public Subject getSource() {
        return source;
    }
}
