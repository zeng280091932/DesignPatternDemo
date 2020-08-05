package com.beauney.proxy.v2;

/**
 * @author zengjiantao
 * @since 2020-08-05
 */
public class Car2 extends Car {
    @Override
    public void move() {
        long start = System.currentTimeMillis();
        super.move();
        long end = System.currentTimeMillis();
        System.out.println("汽车移动时间:" + (end - start));
    }
}
