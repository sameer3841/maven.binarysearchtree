package com.github.curriculeon.binarytreenode;

import com.github.curriculeon.BinarySearchTreeNode;
import org.junit.Assert;
import org.junit.Test;

public class SetLeftTest {
    @Test
    public void testSetLeft() {
        BinarySearchTreeNode<Integer, String> node = new BinarySearchTreeNode<>(5, "five");
        BinarySearchTreeNode<Integer, String> left = new BinarySearchTreeNode<>(3, "three");
        Assert.assertNull(node.getLeft());
        node.setLeft(left);
        Assert.assertEquals(left, node.getLeft());
    }

    @Test
    public void testSetLeftToNull() {
        BinarySearchTreeNode<Integer, String> node = new BinarySearchTreeNode<>(5, "five");
        BinarySearchTreeNode<Integer, String> left = new BinarySearchTreeNode<>(3, "three");
        Assert.assertNull(node.getLeft());
        node.setLeft(left);
        Assert.assertEquals(left, node.getLeft());
        node.setLeft(null);
        Assert.assertNull(node.getLeft());
    }

    @Test
    public void testSetLeftToExistingNode() {
        BinarySearchTreeNode<Integer, String> node = new BinarySearchTreeNode<>(5, "five");
        BinarySearchTreeNode<Integer, String> left1 = new BinarySearchTreeNode<>(3, "three");
        BinarySearchTreeNode<Integer, String> left2 = new BinarySearchTreeNode<>(2, "two");
        Assert.assertNull(node.getLeft());
        node.setLeft(left1);
        Assert.assertEquals(left1, node.getLeft());
        node.setLeft(left2);
        Assert.assertEquals(left2, node.getLeft());
    }

    @Test
    public void testSetLeftWithDifferentKeyType() {
        BinarySearchTreeNode<Integer, String> node = new BinarySearchTreeNode<>(5, "five");
        BinarySearchTreeNode<Integer, String> left = new BinarySearchTreeNode<>(3, "three");
        Assert.assertNull(node.getLeft());
        node.setLeft(left);
        Assert.assertEquals(left, node.getLeft());
    }

}
