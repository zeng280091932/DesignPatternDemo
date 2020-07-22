package com.beauney.builder.original;

/**
 * 电脑设计者
 *
 * @author zengjiantao
 * @since 2020-07-22
 */
public class Designer {
    private IBuilder builder;

    public Designer(IBuilder builder) {
        this.builder = builder;
    }

    public Computer create() {
        builder.makeKeyboard();
        builder.makeMouse();
        builder.makeScreen();
        return builder.create();
    }
}
