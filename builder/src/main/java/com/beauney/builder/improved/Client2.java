package com.beauney.builder.improved;

/**
 * @author zengjiantao
 * @since 2020-07-22
 */
public class Client2 {
    public static void main(String[] args) {
        Computer computer = new Builder()
                .setKeyboard("无线键盘")
                .setMouse("有线鼠标")
                .setScreen("坨坨显示器")
                .create();
        System.out.println(computer);
    }
}
