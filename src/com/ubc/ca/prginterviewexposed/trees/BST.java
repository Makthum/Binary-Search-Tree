/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ubc.ca.prginterviewexposed.trees;


/**
 *
 * @author Makthum
 */
public class BST {
    
    private Node root=new Node(null, null, 0);
     
    public static Node insertNode(Node temp,int value)
    {
        if(temp==null)
            return new Node(null,null,value);
        else if(temp.value>value)
        {
            temp.setRight(insertNode(temp, value));
        }
        else if(temp.value<value)
        {
            temp.setLeft(insertNode(temp, value));
        }
        return temp;
    }
    
    public static void printTree(Node root)
    {
        
    }
    
}
