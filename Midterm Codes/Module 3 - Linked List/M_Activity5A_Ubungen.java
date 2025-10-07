/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.m_activity5a_ubungen;

/**
 *
 * @Ubungen, John Daniel L.
 */
public class M_Activity5A_Ubungen {
    Node head;
    
    static class Node {
        int value;
        Node next;
        Node (int d) {
            value = d;
            next = null;
        }
    }

    public static void main(String[] args) {
        M_Activity5A_Ubungen linkedList = new M_Activity5A_Ubungen();
        
        linkedList.head = new Node (1);
        Node second = new Node(2);
        Node third  = new Node(3);
        Node fourth  = new Node(4);
        Node fifth  = new Node(5);
        Node sixth  = new Node(6);
        Node seventh  = new Node(7);
        Node eighth = new Node(8);
        linkedList.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = seventh;
        seventh.next = eighth;
        
        System.out.print("Linked List: ");
        while (linkedList.head != null) {
            System.out.print(linkedList.head.value + " ");
            linkedList.head = linkedList.head.next;
        }
    }
}
