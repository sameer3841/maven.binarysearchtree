package com.github.curriculeon;

public class BinarySearchTreeNode<Key extends Comparable<Key>, Value> {

    private Key key;
    private Value value;
    private BinarySearchTreeNode left;
    private BinarySearchTreeNode right;
    private BinarySearchTreeNode prev;

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
        if (left != null) left.setPrev(this);
    }

    public BinarySearchTreeNode<Key, Value> getRight() {
        return right; // TODO
    }

    public void setRight(BinarySearchTreeNode<Key, Value> right) {
        this.right = right;
        if (right != null) right.setPrev(this);
    }

    public BinarySearchTreeNode<Key, Value> getPrev() {
        return prev;
    }

    public void setPrev(BinarySearchTreeNode<Key, Value> previous) {
        prev = previous;
    }

    public boolean hasPrev(){
        return prev != null;
    }

    @Override
    public String toString() {
        return "(" + getKey() + ", " + getValue() + ")";
    }
}

