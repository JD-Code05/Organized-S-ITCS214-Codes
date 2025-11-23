/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.f_activity4_ubungen;

/**
 *
 * @Ubungen, John Daniel L., BCS23
 */
public class F_Activity4_Ubungen {
    static class Node {
        String item;
        Node left, right;
        
        public Node (String key) {
            item = key;
            left = right = null;
        }
    }
    static class Main {
        // root of Tree
        Node root;
        Main() {
            root = null;
        }
        // method to count leaf nodes
        public static int countLeaf(Node node) {
            if(node == null) {
                return 0;
            }
            // if left and right of the node is null // it is leaf node
            if (node.left == null && node.right == null) {
                return 1;
            }
            else { 
                return countLeaf(node.left) + countLeaf(node.right);
            }
        }    
    }
    public static void main(String[] args) { 
        // create an object of Tree
        Main tree = new Main();
        // create nodes of tree
        tree.root = new Node("p");
        
        tree.root.left = new Node("g");
        // create child nodes of left child
        tree.root.left.left = new Node("c");
        tree.root.left.left.left = new Node("a");
        tree.root.left.left.right = new Node("e");
        
        tree.root.left.right = new Node("k");
        tree.root.left.right.left = new Node("i");
        tree.root.left.right.right = new Node("m");
        
        tree.root.right = new Node("w");
        // create child nodes of right child
        tree.root.right.left = new Node("s");
        tree.root.right.left.left = new Node("q");
        tree.root.right.left.right = new Node("u");
        
        tree.root.right.right = new Node("y");
        tree.root.right.right.left = new Node("x");
        tree.root.right.right.right = new Node("z");
        
        // call method to count leaf nodes
        int leafNodes = Main.countLeaf(tree.root);
        System.out.println("Total Leaf Nodes = " + leafNodes);
    }
}
