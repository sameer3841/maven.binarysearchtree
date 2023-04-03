package com.github.curriculeon.binarytreenode;

import com.github.curriculeon.BinarySearchTreeNode;
import org.junit.Assert;
import org.junit.Test;

public class SetKeyTest {
    @Test
    public void testSetKey() {
        BinarySearchTreeNode<Integer, String> node = new BinarySearchTreeNode<>(5, "five");
        Assert.assertEquals(5, node.getKey().intValue());
        node.setKey(10);
        Assert.assertEquals(10, node.getKey().intValue());
    }

    @Test
    public void testSetNullKey() {
        BinarySearchTreeNode<Integer, String> node = new BinarySearchTreeNode<>(5, "five");
        Assert.assertEquals(5, node.getKey().intValue());
        node.setKey(null);
        Assert.assertNull(node.getKey());
    }

    @Test
    public void testSetStringKeys() {
        BinarySearchTreeNode<String, String> node = new BinarySearchTreeNode<>("key", "value");
        Assert.assertEquals("key", node.getKey());
        node.setKey("new key");
        Assert.assertEquals("new key", node.getKey());
    }

    @Test
    public void testSetDifferentKeyTypes() {
        BinarySearchTreeNode<Integer, String> node = new BinarySearchTreeNode<>(10, "value");
        Assert.assertEquals(10, node.getKey().intValue());
        node.setKey(5);
        Assert.assertEquals(5, node.getKey().intValue());
    }

}
