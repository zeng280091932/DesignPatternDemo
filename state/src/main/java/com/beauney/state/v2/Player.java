package com.beauney.state.v2;

/**
 * @author zengjiantao
 * @since 2020-08-14
 */
public class Player {
    State state;

    public void shot() {
        state.shot();
    }

    public void pass() {
        state.pass();
    }

    public void run() {
        state.run();
    }
}
