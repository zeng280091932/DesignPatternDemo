package com.beauney.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zengjiantao
 * @since 2020-08-03
 */
public class BranchNode extends Node {
    private String name;

    private List<Node> nodes = new ArrayList<>();

    public BranchNode(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println(name);
    }

    public void addNode(Node node) {
        nodes.add(node);
    }

    public List<Node> getNodes() {
        return nodes;
    }
}
