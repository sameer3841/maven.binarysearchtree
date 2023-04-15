package com.github.curriculeon;

public class BinarySearchTreeNode<Key extends Comparable<Key>, Value> {

    private Key key;
    private Value value;
    private BinarySearchTreeNode left;
    private BinarySearchTreeNode right;

    public BinarySearchTreeNode(Key key, Value value) {
        setKey(key);
        setValue(value);
    }

    public Key getKey() {
        return key; // TODO
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public Value getValue() {
        return value; // TODO
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public BinarySearchTreeNode<Key, Value> getLeft() {
        return left; // TODO
    }

    public void setLeft(BinarySearchTreeNode<Key, Value> left) {
        this.left = left;
    }

    public BinarySearchTreeNode<Key, Value> getRight() {
        return right; // TODO
    }

    public void setRight(BinarySearchTreeNode<Key, Value> right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "(" + getKey() + ", " + getValue() + ")";
    }
}

