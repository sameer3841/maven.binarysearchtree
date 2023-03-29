package com.github.curriculeon;

public class BinaryTreeNode<Key extends Comparable<Key>, Value> {
    private Key key;
    private Value value;
    private BinaryTreeNode<Key, Value> left;
    private BinaryTreeNode<Key, Value> right;

    public BinaryTreeNode(Key key, Value value) {
        this.key = key;
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public BinaryTreeNode<Key, Value> getLeft() {
        return left;
    }

    public void setLeft(BinaryTreeNode<Key, Value> left) {
        this.left = left;
    }

    public BinaryTreeNode<Key, Value> getRight() {
        return right;
    }

    public void setRight(BinaryTreeNode<Key, Value> right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "(" + key + ", " + value + ")";
    }
}

