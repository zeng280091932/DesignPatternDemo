package com.beauney.builder.original;

/**
 * 抽象的电脑构建者
 * @author zengjiantao
 * @since 2020-07-22
 */
public interface IBuilder {
    void makeKeyboard();

    void makeMouse();

    void makeScreen();

    Computer create();
}
