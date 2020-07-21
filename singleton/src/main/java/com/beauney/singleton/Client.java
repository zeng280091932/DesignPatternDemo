package com.beauney.singleton;

/**
 * @author zengjiantao
 * @since 2020-07-21
 */
public class Client {
    public static void main(String[] args) {
        //饿汉模式调用
        EHSingleton.getInstance().doSomeThing();

        //懒汉模式调用
        LHSingleton.getInstance().doSomeThing();

        //DCL模式调用
        DCLSingleton.getInstance().doSomeThing();

        //内部类模式调用
        InnerClassSingleton.getInstance().doSomeThing();

        //枚举模式调用
        EnumSingleton.INSTANCE.doSomeThing();
    }
}
