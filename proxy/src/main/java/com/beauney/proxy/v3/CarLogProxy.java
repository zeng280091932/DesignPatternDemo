package com.beauney.proxy.v3;

import com.beauney.proxy.Movable;

/**
 * @author zengjiantao
 * @since 2020-08-05
 */
public class CarLogProxy implements Movable {
    private Car car;

    public CarLogProxy(Car car) {
        this.car = car;
    }

    @Override
    public void move() {
        System.out.println("start move");
        car.move();
        System.out.println("stop move");
    }
}
