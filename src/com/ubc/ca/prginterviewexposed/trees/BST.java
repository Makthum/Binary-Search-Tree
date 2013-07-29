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
    
    private Node root=null;
     
    public static Node insertNode(Node temp,int value)
    {
        if(temp==null)
            return new Node(null,null,value);
        else if(temp.value>value)
        {
            temp.setLeft(insertNode(temp.getLeft(), value));
        }
        else if(temp.value<value)
        {
            temp.setRight(insertNode(temp.getRight(), value));
        }
        return temp;
    }
    
    public static void preOrderTraversal(Node root)
    {
        if(root!=null)
        {
            System.out.println(root.value);
            preOrderTraversal(root.getLeft());
            preOrderTraversal(root.getRight());
        }
    }
    
    public static void inOrderTraversal(Node root)
    {
        if(root!=null)
        {
            inOrderTraversal(root.getLeft());
            System.out.println(root.value);
            inOrderTraversal(root.getRight());
        }
    }
    
       public static void postOrderTraversal(Node root)
    {
        if(root!=null)
        {
            postOrderTraversal(root.getLeft());
            postOrderTraversal(root.getRight());
            System.out.println(root.value);

        }
    }
    
    public static void main(String args[])
    {
        BST bst= new BST();
        bst.launch();
              
    }
    
    public void launch()
    {
        root= insertNode(root, 11);
        root=insertNode(root, 22);
        root=insertNode(root, 5);
        root=insertNode(root, 1);
        root=insertNode(root, 2);
        root=insertNode(root,0);
        root=insertNode(root, 4);
        preOrderTraversal(root);
      //  inOrderTraversal(root);
     //   postOrderTraversal(root);
        
    }
    
}
