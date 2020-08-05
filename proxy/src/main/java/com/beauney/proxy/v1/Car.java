package com.beauney.proxy.v1;

import com.beauney.proxy.Movable;

import java.util.Random;

/**
 * 问题：我想记录汽车的移动时间
 * 最简单的办法：修改代码，记录时间
 *
 * @author zengjiantao
 * @since 2020-08-05
 */
public class Car implements Movable {
    /**
     * 模拟汽车移动了一段儿时间
     */
    @Override
    public void move() {
        long start = System.currentTimeMillis();
        //汽车本身的业务逻辑start
        System.out.println("Car moving wuwuwuwuwu...");
        try {
            Thread.sleep(new Random().nextInt(10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //汽车本身的业务逻辑end
        long end = System.currentTimeMillis();
        System.out.println("汽车移动时间:" + (end - start));
    }
}
