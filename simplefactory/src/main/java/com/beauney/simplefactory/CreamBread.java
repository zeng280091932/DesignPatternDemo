package com.beauney.simplefactory;

/**
 * @author zengjiantao
 * @since 2020-07-20
 */
public class CreamBread implements IBread {
    @Override
    public void eat() {
        System.out.println("奶油味面包被吃了");
    }
}
