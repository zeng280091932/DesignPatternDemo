package com.beauney.observer.v6;

/**
 * @author zengjiantao
 * @since 2020-07-30
 */
public interface Observer {
    void handleWakeEvent(WakeUpEvent event);
}
