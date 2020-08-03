package com.beauney.flyweight;

/**
 * @author zengjiantao
 * @since 2020-08-03
 */
public class GirlFriend extends Girl {
    public GirlFriend(int state) {
        super(state);
    }

    @Override
    public void operate() {
        this.setState(1);
        System.out.println("共享女友，陪吃、陪玩……" + hashCode());
        this.setState(0);
    }
}
