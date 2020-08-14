package com.beauney.state.v2;

/**
 * @author zengjiantao
 * @since 2020-08-14
 */
public class GoodState extends State {
    @Override
    public void run() {
        System.out.println("跑动不累");
    }

    @Override
    public void pass() {
        System.out.println("传球精准");
    }

    @Override
    public void shot() {
        System.out.println("射门精准");
    }
}
