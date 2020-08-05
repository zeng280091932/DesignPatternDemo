package com.beauney.proxy.v2;

import com.beauney.proxy.Movable;

import java.util.Random;

/**
 * 问题：我想记录汽车的移动时间
 * 最简单的办法：修改代码，记录时间
 * 问题2：如果无法改变方法源码呢？
 * 用继承？
 *
 * @author zengjiantao
 * @since 2020-08-05
 */
public class Car implements Movable {
    @Override
    public void move() {
        //汽车本身的业务逻辑start
        System.out.println("Car moving wuwuwuwuwu...");
        try {
            Thread.sleep(new Random().nextInt(10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //汽车本身的业务逻辑end
    }
}
