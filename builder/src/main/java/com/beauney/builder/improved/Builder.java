package com.beauney.builder.improved;

import com.beauney.builder.original.IBuilder;

/**
 * 实际的电脑构建者
 *
 * @author zengjiantao
 * @since 2020-07-22
 */
public class Builder {

    private Computer computer;

    private ComputerParams params = new ComputerParams();

    public Builder setKeyboard(String keyboard) {
        params.keyboard = keyboard;
        return this;
    }

    public Builder setMouse(String mouse) {
        params.mouse = mouse;
        return this;
    }

    public Builder setScreen(String screen) {
        params.screen = screen;
        return this;
    }

    public Computer create() {
        computer = new Computer();
        computer.apply(params);
        return computer;
    }

    class ComputerParams {
        String keyboard;

        String mouse;

        String screen;
    }
}
