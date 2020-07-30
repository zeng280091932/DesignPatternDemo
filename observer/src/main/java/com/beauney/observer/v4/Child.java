package com.beauney.observer.v4;

import android.icu.util.MeasureUnit;

/**
 * @author zengjiantao
 * @since 2020-07-30
 */
public class Child {
    private boolean cry;
    private Dad dad;
    private Mum mum;
    private Dog dog;

    public Child() {
        dad = new Dad();
        mum = new Mum();
        dog = new Dog();
    }

    public boolean isCry() {
        return cry;
    }

    public void wakeUp() {
        System.out.println("Child is crying.......");
        cry = true;
        dad.food();
        mum.hug();
        dog.wang();
    }
}
