package com.github.curriculeon;

public class BinarySearchTreePrinter<Key extends Comparable<Key>, Value> {
    private final BinarySearchTree<Key, Value> bst;

    public BinarySearchTreePrinter(BinarySearchTree<Key, Value> bst) {
        this.bst = bst;
    }

    public String printInOrder() {
        return printInOrder(bst.getRoot(), 0, new StringBuilder());
    }

    public String printPreOrder() {
        return printPreOrder(bst.getRoot(), 0, new StringBuilder());
    }

    public String printPostOrder() {
        return printPostOrder(bst.getRoot(), 0, new StringBuilder());
    }

    private String printInOrder(BinaryTreeNode<Key, Value> node, int level, StringBuilder sb) {
        if (node != null) {
            printInOrder(node.getRight(), level + 1, sb);
            for (int i = 0; i < level; i++) {
                sb.append("    ");
            }
            sb.append(node.getKey() + "\n");
            printInOrder(node.getLeft(), level + 1, sb);
        }
        return sb.toString();
    }

    private String printPreOrder(BinaryTreeNode<Key, Value> node, int level,StringBuilder sb) {
        if (node != null) {
            for (int i = 0; i < level; i++) {
                sb.append("    ");
            }
            sb.append(node.getKey() + "\n");
            printPreOrder(node.getLeft(), level + 1, sb);
            printPreOrder(node.getRight(), level + 1, sb);
        }
        return sb.toString();
    }

    private String printPostOrder(BinaryTreeNode<Key, Value> node, int level, StringBuilder sb) {
        if (node != null) {
            printPostOrder(node.getLeft(), level + 1, sb);
            printPostOrder(node.getRight(), level + 1, sb);
            for (int i = 0; i < level; i++) {
                sb.append("    ");
            }
            sb.append(node.getKey() + "\n");
        }
        return sb.toString();
    }
}
