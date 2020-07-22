package com.beauney.builder.original;

import com.beauney.builder.improved.Builder;

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

    public String getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }

    public String getMouse() {
        return mouse;
    }

    public void setMouse(String mouse) {
        this.mouse = mouse;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
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
