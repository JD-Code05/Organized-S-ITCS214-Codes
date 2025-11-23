/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.f_activity5_ubungen;

/**
 *
 * @author student
 */
public class F_Activity5_Ubungen {
    static class Node {
        String item;
        Node left, right;
        
        public Node(String key) {
            item = key;
            left = right = null;
        }
    }
    static class Tree {
        Node root;
        
        Tree() {
            root = null;
        }
        void inOrder(Node node){
            if (node == null)
                return;
            inOrder(node.left);
            System.out.print(node.item + " -> ");
            inOrder(node.right);
        }
        void preOrder(Node node){
            if (node == null)
                return;
            System.out.print(node.item + " -> ");
            preOrder(node.left);
            preOrder(node.right);
        }
        void postOrder(Node node){
            if (node == null)
                return;
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node.item + " -> ");
    }
    }
    public static void main(String[] args) {
        Tree tree = new Tree();
        
        //create nodes of tree
        tree.root = new Node("A");
        
        tree.root.left = new Node("B");
        //create a child nodes of left child
        tree.root.left.left = new Node("D");
        tree.root.left.right = new Node("E");
        tree.root.left.right.left = new Node("F");
        
        tree.root.right = new Node("C");
        //create a child Nodes of right child
        tree.root.right.right = new Node("G");
        
        System.out.println("InOrder Traversal");
        tree.inOrder(tree.root);
        System.out.println("\b\b\b\b");
        
        System.out.println("Pre-Order Traversal");
        tree.preOrder(tree.root);
        System.out.println("\b\b\b\b");
        
        System.out.println("post-Order Traversal");
        tree.postOrder(tree.root);
        System.out.println("\b\b\b\b");       
    }
}
