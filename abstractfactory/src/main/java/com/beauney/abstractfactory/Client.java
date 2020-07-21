package com.beauney.abstractfactory;

/**
 * @author zengjiantao
 * @since 2020-07-20
 */
public class Client {
    public static void main(String[] args) {
        //生成奶油面包工厂，再有工厂生成奶油面包
        IFactory factory = new CreamBreadFactory();
        factory.create().eat();

        //生成水果面包工厂，再有工厂生成水果面包
        factory = new FruitsBreadFactory();
        factory.create().eat();
    }
}
