package com.github.curriculeon.binarytreenode;

import com.github.curriculeon.BinarySearchTreeNode;
import org.junit.Assert;
import org.junit.Test;

public class SetValueTest {
    @Test
    public void testSetValue() {
        BinarySearchTreeNode<Integer, String> node = new BinarySearchTreeNode<>(5, "five");
        Assert.assertEquals("five", node.getValue());
        node.setValue("new five");
        Assert.assertEquals("new five", node.getValue());
    }

    @Test
    public void testSetNullValue() {
        BinarySearchTreeNode<Integer, String> node = new BinarySearchTreeNode<>(5, "five");
        Assert.assertEquals("five", node.getValue());
        node.setValue(null);
        Assert.assertNull(node.getValue());
    }

    @Test
    public void testSetStringValues() {
        BinarySearchTreeNode<String, String> node = new BinarySearchTreeNode<>("key", "value");
        Assert.assertEquals("value", node.getValue());
        node.setValue("new value");
        Assert.assertEquals("new value", node.getValue());
    }

    @Test
    public void testSetDifferentValueTypes() {
        BinarySearchTreeNode<Integer, Object> node = new BinarySearchTreeNode<>(10, 123);
        Assert.assertEquals(123, node.getValue());
        node.setValue("new value");
        Assert.assertEquals("new value", node.getValue());
    }

}
