/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ubc.ca.prginterviewexposed.trees;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/**
 *This class defines the structure for Node which will be used in constructing Binary Search Trees
 * @author Mohamed Makthum Mohamed Ikbal
 * 
 */
public class Node {
    private Node right;
    private Node left;
    int value;

    public Node getRight() {
        return right;
    }

    public Node getLeft() {
        return left;
    }

    public int getValue() {
        return value;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node(Node right, Node left, int value) {
        this.right = right;
        this.left = left;
        this.value = value;
    }

    public Node() {
        this.right=null;
        this.left=null;
        this.value=0;
        
    }
    
   
}
