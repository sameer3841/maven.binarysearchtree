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
        if (x == null) {
            return null;
        }
        int cmp = key.compareTo(x.getKey());
        if (cmp < 0) {
            return get(x.getLeft(), key);
        } else if (cmp > 0) {
            return get(x.getRight(), key);
        } else {
            return x.getValue();
        }
    }

    private BinaryTreeNode<Key, Value> put(BinaryTreeNode<Key, Value> x, Key key, Value value) {
        if (x == null) {
            size++;
            return new BinaryTreeNode<Key, Value>(key, value);
        }
        int cmp = key.compareTo(x.getKey());
        if (cmp < 0) {
            x.setLeft(put(x.getLeft(), key, value));
        } else if (cmp > 0) {
            x.setRight(put(x.getRight(), key, value));
        } else {
            x.setValue(value);
        }
        return x;
    }

    private BinaryTreeNode<Key, Value> min(BinaryTreeNode<Key, Value> x) {
        if (x.getLeft() == null) {
            return x;
        }
        return min(x.getLeft());
    }

    private BinaryTreeNode<Key, Value> max(BinaryTreeNode<Key, Value> x) {
        if (x.getRight() == null) {
            return x;
        }
        return max(x.getRight());
    }

    private BinaryTreeNode<Key, Value> deleteMin(BinaryTreeNode<Key, Value> x) {
        if (x.getLeft() == null) {
            return x.getRight();
        }
        x.setLeft(deleteMin(x.getLeft()));
        return x;
    }

    private BinaryTreeNode<Key, Value> deleteMax(BinaryTreeNode<Key, Value> x) {
        if (x.getRight() == null) {
            return x.getLeft();
        }
        x.setRight(deleteMax(x.getRight()));
        return x;
    }

    private BinaryTreeNode<Key, Value> delete(BinaryTreeNode<Key, Value> x, Key key) {
        if (x == null) {
            return null;
        }
        int cmp = key.compareTo(x.getKey());
        if (cmp < 0) {
            x.setLeft(delete(x.getLeft(), key));
        } else if (cmp > 0) {
            x.setRight(delete(x.getRight(), key));
        } else {
            if (x.getRight() == null) {
                return x.getLeft();
            }
            if (x.getLeft() == null) {
                return x.getRight();
            }
            BinaryTreeNode<Key, Value> t = x;
            x = min(t.getRight());
            x.setRight(deleteMin(t.getRight()));
            x.setLeft(t.getLeft());
        }
        return x;
    }

}
