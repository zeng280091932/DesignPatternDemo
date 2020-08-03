package com.beauney.flyweight;

/**
 * 享元模式（Flyweight）
 *
 * @author zengjiantao
 * @since 2020-08-03
 */
public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            Girl girl = GirlFriendFactory.getGirlFriend();
            girl.operate();
        }

        GirlFriendFactory.printSize();
    }
}
