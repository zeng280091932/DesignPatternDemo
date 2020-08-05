package com.beauney.proxy.v4;

import com.beauney.proxy.Movable;

/**
 * @author zengjiantao
 * @since 2020-08-05
 */
public class CarTimeProxy implements Movable {
    private Movable movable;

    public CarTimeProxy(Movable movable) {
        this.movable = movable;
    }

    @Override
    public void move() {
        long start = System.currentTimeMillis();
        movable.move();
        long end = System.currentTimeMillis();
        System.out.println("汽车移动时间:" + (end - start));
    }
}
