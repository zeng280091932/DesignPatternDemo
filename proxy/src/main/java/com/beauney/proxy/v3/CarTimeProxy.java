package com.beauney.proxy.v3;

import com.beauney.proxy.Movable;

/**
 * @author zengjiantao
 * @since 2020-08-05
 */
public class CarTimeProxy implements Movable {
    private Car car;

    public CarTimeProxy(Car car) {
        this.car = car;
    }

    @Override
    public void move() {
        long start = System.currentTimeMillis();
        car.move();
        long end = System.currentTimeMillis();
        System.out.println("汽车移动时间:" + (end - start));
    }
}
