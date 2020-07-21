package com.beauney.abstractfactory;

/**
 * @author zengjiantao
 * @since 2020-07-20
 */
public class FruitsBread implements IBread {
    @Override
    public void eat() {
        System.out.println("水果味面包被吃了");
    }
}
