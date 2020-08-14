package com.beauney.state.v2;


/**
 * @author zengjiantao
 * @since 2020-08-14
 */
public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        System.out.println("------------球员状态好------------");
        player.state = new GoodState();
        player.run();
        player.pass();
        player.shot();

        System.out.println("------------球员状态差------------");
        player.state = new BadState();
        player.run();
        player.pass();
        player.shot();
    }
}
