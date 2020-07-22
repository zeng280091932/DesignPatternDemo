package com.beauney.builder.original;

/**
 * 客户
 *
 * @author zengjiantao
 * @since 2020-07-22
 */
public class Client {
    public static void main(String[] args) {
        Designer designer = new Designer(new Builder());
        Computer computer = designer.create();
        System.out.println(computer);
    }
}
