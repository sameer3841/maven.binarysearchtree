package com.github.curriculeon;

import java.util.NoSuchElementException;

public class BinarySearchTree<Key extends Comparable<Key>, Value> {

    private BinaryTreeNode<Key, Value> root;
    private int size;

    public BinarySearchTree() {
        root = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public BinaryTreeNode<Key, Value> getRoot() {
        return root;
    }

    public Value get(Key key) {
        return get(root, key);
    }

    public void put(Key key, Value value) {
        root = put(root, key, value);
    }

    public Key min() {
        if (isEmpty()) {
            throw new NoSuchElementException("Symbol table is empty");
        }
        return min(root).getKey();
    }

    public Key max() {
        if (isEmpty()) {
            throw new NoSuchElementException("Symbol table is empty");
        }
        return max(root).getKey();
    }

    public void deleteMin() {
        if (isEmpty()) {
            throw new NoSuchElementException("Symbol table is empty");
        }
        root = deleteMin(root);
        size--;
    }

    public void deleteMax() {
        if (isEmpty()) {
            throw new NoSuchElementException("Symbol table is empty");
        }
        root = deleteMax(root);
        size--;
    }

    public void delete(Key key) {
        root = delete(root, key);
    }

    private Value get(BinaryTreeNode<Key, Value> x, Key key) {
        return null; // TODO
    }

    private BinaryTreeNode<Key, Value> put(BinaryTreeNode<Key, Value> x, Key key, Value value) {
        return null; // TODO
    }

    private BinaryTreeNode<Key, Value> min(BinaryTreeNode<Key, Value> x) {
        return null; // TODO
    }

    private BinaryTreeNode<Key, Value> max(BinaryTreeNode<Key, Value> x) {
        return null; // TODO
    }

    private BinaryTreeNode<Key, Value> deleteMin(BinaryTreeNode<Key, Value> x) {
        return null; // TODO
    }

    private BinaryTreeNode<Key, Value> deleteMax(BinaryTreeNode<Key, Value> x) {
        return null; // TODO
    }

    private BinaryTreeNode<Key, Value> delete(BinaryTreeNode<Key, Value> x, Key key) {
        return null; // TODO
    }

}
