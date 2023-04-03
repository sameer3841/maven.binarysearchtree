package com.github.curriculeon.binarytreenode;

import com.github.curriculeon.BinarySearchTreeNode;
import org.junit.Assert;
import org.junit.Test;

public class SetRightTest {
    @Test
    public void testSetRight() {
        BinarySearchTreeNode<Integer, String> node = new BinarySearchTreeNode<>(5, "five");
        BinarySearchTreeNode<Integer, String> right = new BinarySearchTreeNode<>(8, "eight");
        Assert.assertNull(node.getRight());
        node.setRight(right);
        Assert.assertEquals(right, node.getRight());
    }

    @Test
    public void testSetRightToNull() {
        BinarySearchTreeNode<Integer, String> node = new BinarySearchTreeNode<>(5, "five");
        BinarySearchTreeNode<Integer, String> right = new BinarySearchTreeNode<>(8, "eight");
        Assert.assertNull(node.getRight());
        node.setRight(right);
        Assert.assertEquals(right, node.getRight());
        node.setRight(null);
        Assert.assertNull(node.getRight());
    }

    @Test
    public void testSetRightToExistingNode() {
        BinarySearchTreeNode<Integer, String> node = new BinarySearchTreeNode<>(5, "five");
        BinarySearchTreeNode<Integer, String> right1 = new BinarySearchTreeNode<>(8, "eight");
        BinarySearchTreeNode<Integer, String> right2 = new BinarySearchTreeNode<>(10, "ten");
        Assert.assertNull(node.getRight());
        node.setRight(right1);
        Assert.assertEquals(right1, node.getRight());
        node.setRight(right2);
        Assert.assertEquals(right2, node.getRight());
    }

    @Test
    public void testSetRightWithDifferentKeyType() {
        BinarySearchTreeNode<Integer, String> node = new BinarySearchTreeNode<>(5, "five");
        BinarySearchTreeNode<Integer, String> right = new BinarySearchTreeNode<>(8, "eight");
        Assert.assertNull(node.getRight());
        node.setRight(right);
        Assert.assertEquals(right, node.getRight());
    }

}
