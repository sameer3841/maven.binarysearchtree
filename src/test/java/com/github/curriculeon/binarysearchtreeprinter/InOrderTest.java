package com.github.curriculeon.binarysearchtreeprinter;

import com.github.curriculeon.BinarySearchTree;
import com.github.curriculeon.BinarySearchTreePrinter;
import org.junit.Assert;
import org.junit.Test;

public class InOrderTest {
    @Test
    public void testPrintInOrder() {
        BinarySearchTree<Integer, String> bst = new BinarySearchTree<>();
        bst.put(5, "five");
        bst.put(3, "three");
        bst.put(7, "seven");
        bst.put(2, "two");
        bst.put(4, "four");
        bst.put(6, "six");
        bst.put(8, "eight");
        BinarySearchTreePrinter<Integer, String> printer = new BinarySearchTreePrinter<>(bst);
        String expected = "2\n" +
                "3\n" +
                "4\n" +
                "5\n" +
                "6\n" +
                "7\n" +
                "8\n";
        String actual = printer.printInOrder();
        Assert.assertEquals(expected, actual);
    }
}
