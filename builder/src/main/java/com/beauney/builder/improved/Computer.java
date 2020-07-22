package com.beauney.builder.improved;

/**
 * 电脑实体
 *
 * @author zengjiantao
 * @since 2020-07-22
 */
public class Computer {
    private String keyboard;

    private String mouse;

    private String screen;

    public void apply(Builder.ComputerParams params) {
        keyboard = params.keyboard;
        mouse = params.mouse;
        screen = params.screen;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "keyboard='" + keyboard + '\'' +
                ", mouse='" + mouse + '\'' +
                ", screen='" + screen + '\'' +
                '}';
    }
}
