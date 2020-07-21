package com.beauney.singleton;

/**
 * 单例模式之饿汉模式
 *
 * @author zengjiantao
 * @since 2020-07-21
 */
public class EHSingleton {
    private static EHSingleton sInstance = new EHSingleton();

    private EHSingleton() {
    }

    public static EHSingleton getInstance() {
        return sInstance;
    }

    public void doSomeThing() {

    }
}
