package com.beauney.proxy.v4;

import com.beauney.proxy.Movable;

/**
 * @author zengjiantao
 * @since 2020-08-05
 */
public class CarLogProxy implements Movable {
    private Movable movable;

    public CarLogProxy(Movable movable) {
        this.movable = movable;
    }

    @Override
    public void move() {
        System.out.println("start move");
        movable.move();
        System.out.println("stop move");
    }
}
