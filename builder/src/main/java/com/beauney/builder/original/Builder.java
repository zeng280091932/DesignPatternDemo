package com.beauney.builder.original;


/**
 * @author zengjiantao
 * @since 2020-07-22
 */
public class Builder implements IBuilder {
    Computer computer = new Computer();

    @Override
    public void makeKeyboard() {
        computer.setKeyboard("机械键盘");
    }

    @Override
    public void makeMouse() {
        computer.setMouse("无线鼠标");
    }

    @Override
    public void makeScreen() {
        computer.setScreen("液晶显示屏");
    }

    @Override
    public Computer create() {
        return computer;
    }
}
