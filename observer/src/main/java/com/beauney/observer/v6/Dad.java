package com.beauney.observer.v6;

/**
 * @author zengjiantao
 * @since 2020-07-30
 */
public class Dad implements Observer {
    @Override
    public void handleWakeEvent(WakeUpEvent event) {
        System.out.println(event.getTime() + "小孩醒了，爸爸喂奶奶。。。。");
    }
}
