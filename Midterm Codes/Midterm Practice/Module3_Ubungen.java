/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.module3_ubungen;

/**
 *
 * @author John Daniel Ubungen
 */
public class Module3_Ubungen {
    // The head node represents the first node in the Linked List
    Node head; // ✅ Correct — this is the starting point of the list

    // Static inner class that defines what a single node looks like
    static class Node {
        int value; // ✅ The data/value stored in this node
        Node next; // ✅ Reference (or pointer) to the next node in the list

        // Constructor that initializes the node's value and sets 'next' to null
        Node(int d) {
            value = d;
            next = null; // ✅ Means this node does not point to any other node yet
        }
    }

    public static void main(String[] args) {
        // Create an object of the main class to access the head
        Module3_Ubungen linkedList = new Module3_Ubungen();

        // ✅ Creating four nodes for the linked list
        linkedList.head = new Node(10); // head node (first element)
        Node second = new Node(20);     // second node
        Node third = new Node(30);      // third node
        Node fourth = new Node(40);     // fourth node

        // ✅ Connecting the nodes together
        linkedList.head.next = second; // head (10) points to second (20)
        second.next = third;           // second (20) points to third (30)
        third.next = fourth;           // third (30) points to fourth (40)
        // fourth.next is null by default, so it marks the end of the list

        // ✅ Printing all the nodes in the linked list
        System.out.print("Linked List: ");
        while (linkedList.head != null) { // loops until we reach the end (null)
            System.out.print(linkedList.head.value + " "); // prints the current node’s value
            linkedList.head = linkedList.head.next; // moves to the next node
        } 
    }
}
