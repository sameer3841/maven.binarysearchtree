package com.github.curriculeon;

public class BinarySearchTreePrinter<Key extends Comparable<Key>, Value> {
    private final BinarySearchTree<Key, Value> bst;

    public BinarySearchTreePrinter(BinarySearchTree<Key, Value> bst) {
        this.bst = bst;
    }

    private String printInOrder(BinaryTreeNode<Key, Value> node, StringBuilder sb) {
        return null; // TODO
    }

    private String printPreOrder(BinaryTreeNode<Key, Value> node, StringBuilder sb) {
        return null; // TODO
    }

    private String printPostOrder(BinaryTreeNode<Key, Value> node, StringBuilder sb) {
        return null; // TODO
    }

    public String printInOrder() {
        return printInOrder(bst.getRoot(), new StringBuilder());
    }

    public String printPreOrder() {
        return printPreOrder(bst.getRoot(), new StringBuilder());
    }

    public String printPostOrder() {
        return printPostOrder(bst.getRoot(), new StringBuilder());
    }
}
