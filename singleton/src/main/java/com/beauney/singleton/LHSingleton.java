package com.beauney.singleton;

/**
 * 单例模式之懒汉模式
 *
 * @author zengjiantao
 * @since 2020-07-21
 */
public class LHSingleton {
    private static LHSingleton sInstance;

    private LHSingleton() {
    }

    public static synchronized LHSingleton getInstance() {
        if (sInstance == null) {
            sInstance = new LHSingleton();
        }
        return sInstance;
    }

    public void doSomeThing() {

    }
}
