/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.module3_ubungen;

/**
 *
 * @author John Daniel Ubungen
 */
public class Module3_Ubungen {
    Node head; //the head of the LinkedList which is the first
    
    static class Node {
        int value; // the number for the linkedList
        Node next; // the Next node after the head
        Node (int d) {
            value = d;
            next = null;
        }
        
    }
   
    
    public static void main(String[] args) {
        Module3_Ubungen linkedList = new Module3_Ubungen();
        
        linkedList.head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);
        
        linkedList.head.next = second;
        second.next = third;
        third.next = fourth;
        
        System.out.print("Linked List: ");
        while (linkedList.head != null) {
            System.out.print(linkedList.head.value + " ");
            linkedList.head = linkedList.head.next;
        } 
    }
}

