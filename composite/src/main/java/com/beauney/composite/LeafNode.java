package com.beauney.composite;

/**
 * @author zengjiantao
 * @since 2020-08-03
 */
public class LeafNode extends Node {
    private String name;

    public LeafNode(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println(name);
    }
}
