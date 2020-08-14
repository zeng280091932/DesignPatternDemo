package com.beauney.state.v2;

/**
 * @author zengjiantao
 * @since 2020-08-14
 */
public class BadState extends State {
    @Override
    public void run() {
        System.out.println("跑动费劲");
    }

    @Override
    public void pass() {
        System.out.println("传球出界");
    }

    @Override
    public void shot() {
        System.out.println("射门打飞机");
    }
}
