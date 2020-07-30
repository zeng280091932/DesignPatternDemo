package com.beauney.observer.v5;

/**
 * @author zengjiantao
 * @since 2020-07-30
 */
public class Mum implements Observer {
    @Override
    public void handleWakeEvent() {
        System.out.println("小孩醒了，妈妈抱抱。。。。");
    }
}
