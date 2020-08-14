package com.beauney.templatemethod;

/**
 * @author zengjiantao
 * @since 2020-08-14
 */
public class TemplateImpl extends Template {
    @Override
    protected void op1() {
        System.out.println("op1");
    }

    @Override
    protected void op2() {
        System.out.println("op2");
    }
}
