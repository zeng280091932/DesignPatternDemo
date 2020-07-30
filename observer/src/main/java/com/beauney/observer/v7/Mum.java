package com.beauney.observer.v7;

/**
 * @author zengjiantao
 * @since 2020-07-30
 */
public class Mum implements Observer {
    @Override
    public void handleWakeEvent(WakeUpEvent event) {
        System.out.println(event.getTime()+"小孩醒了，妈妈抱抱。。。。");
    }
}
