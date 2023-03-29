package com.github.curriculeon;

public class BinaryTreeNode<Key extends Comparable<Key>, Value> {

    public BinaryTreeNode(Key key, Value value) {
    }

    public Key getKey() {
        return null; // TODO
    }

    public void setKey(Key key) {
        // TODO
    }

    public Value getValue() {
        return null; // TODO
    }

    public void setValue(Value value) {
        // TODO
    }

    public BinaryTreeNode<Key, Value> getLeft() {
        return null; // TODO
    }

    public void setLeft(BinaryTreeNode<Key, Value> left) {
        // TODO
    }

    public BinaryTreeNode<Key, Value> getRight() {
        return null; // TODO
    }

    public void setRight(BinaryTreeNode<Key, Value> right) {
        // TODO
    }

    @Override
    public String toString() {
        return "(" + getKey() + ", " + getValue() + ")";
    }
}

