package com.beauney.templatemethod;

/**
 * @author zengjiantao
 * @since 2020-08-14
 */
public abstract class Template {

    public void m(){
        /**
         * 直接调用两个没有实现的抽象方法
         */
        op1();
        op2();
    }

    protected abstract void op1();

    protected abstract void op2();
}
