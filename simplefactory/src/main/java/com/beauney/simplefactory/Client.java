package com.beauney.simplefactory;

/**
 * @author zengjiantao
 * @since 2020-07-20
 */
public class Client {
    public static void main(String[] args) {
        //普通用法
        IBread bread = new Bread();
        bread.eat();

        //简单工厂用法
        IBread bread2 = BreadFactory.create();
        bread2.eat();

        //简单工厂方法并判断类型
        IBread bread3 = BreadFactory.create(2);
        bread3.eat();
    }
}
