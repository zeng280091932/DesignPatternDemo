package com.beauney.composite;

import java.util.List;

/**
 * 组合模式
 *
 * @author zengjiantao
 * @since 2020-08-03
 */
public class Main {
    public static void main(String[] args) {
        BranchNode root = new BranchNode("Root");
        BranchNode chapter1 = new BranchNode("Chapter1");
        BranchNode chapter2 = new BranchNode("Chapter2");
        BranchNode section21 = new BranchNode("section21");

        LeafNode article11 = new LeafNode("Article11");
        LeafNode article12 = new LeafNode("Article12");
        LeafNode article21 = new LeafNode("Article21");
        LeafNode article22 = new LeafNode("Article22");
        LeafNode article211 = new LeafNode("Article211");
        LeafNode article212 = new LeafNode("Article212");
        LeafNode article213 = new LeafNode("Article213");

        root.addNode(chapter1);
        root.addNode(chapter2);

        chapter1.addNode(article11);
        chapter1.addNode(article12);

        chapter2.addNode(article21);
        chapter2.addNode(article22);

        chapter2.addNode(section21);
        section21.addNode(article211);
        section21.addNode(article212);
        section21.addNode(article213);

        tree(root, 0);
    }

    static void tree(Node node, int depth) {
        for (int i = 0; i < depth; i++) {
            System.out.print("--");
        }
        node.print();
        if (node instanceof BranchNode) {
            BranchNode branchNode = (BranchNode) node;
            List<Node> nodes = branchNode.getNodes();
            for (Node node1 : nodes) {
                tree(node1, depth + 1);
            }
        }
    }
}
