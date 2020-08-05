package com.beauney.proxy.v3;

import com.beauney.proxy.Movable;

import java.util.Random;

/**
 * 问题：我想记录坦克的移动时间
 * 最简单的办法：修改代码，记录时间
 * 问题2：如果无法改变方法源码呢？
 * 使用代理
 * 代理有各种类型
 * 问题：如何实现代理的各种组合？继承？Decorator?
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
