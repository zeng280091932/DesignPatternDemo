package com.beauney.proxy.v4;

/**
 * @author zengjiantao
 * @since 2020-08-05
 */
public class Main {
    public static void main(String[] args) {
        new CarTimeProxy(new CarLogProxy(new Car())).move();
//        new CarLogProxy(new CarTimeProxy(new Car())).move();
    }
}
