package com.beauney.singleton;

/**
 * 单例模式之双重检查模式
 *
 * @author zengjiantao
 * @since 2020-07-21
 */
public class DCLSingleton {
    private volatile static DCLSingleton sInstance;

    private DCLSingleton() {
    }

    public static DCLSingleton getInstance() {
        if (sInstance == null) {
            synchronized (DCLSingleton.class) {
                if (sInstance == null) {
                    sInstance = new DCLSingleton();
                }
            }
        }
        return sInstance;
    }

    public void doSomeThing() {

    }
}
