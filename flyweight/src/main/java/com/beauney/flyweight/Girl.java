package com.beauney.flyweight;

/**
 * @author zengjiantao
 * @since 2020-08-03
 */
public abstract class Girl {
    private int state;

    public Girl(int state) {
        this.state = state;
    }

    public abstract void operate();

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
