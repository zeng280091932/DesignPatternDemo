package com.beauney.simplefactory;

/**
 * @author zengjiantao
 * @since 2020-07-20
 */
public class Bread implements IBread {

    @Override
    public void eat() {
        System.out.println("原味面包被吃了");
    }
}
