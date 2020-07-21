package com.beauney.singleton;

/**
 * 单例模式之内部类模式
 *
 * @author zengjiantao
 * @since 2020-07-21
 */
public class InnerClassSingleton {
    private InnerClassSingleton() {
    }

    private static class SingletonHolder {
        private static final InnerClassSingleton INSTANCE = new InnerClassSingleton();
    }

    public static InnerClassSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public void doSomeThing() {

    }
}
