/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.m_activity5b_ubungen;

import java.util.LinkedList;
/**
 *
 * @author student
 */
public class M_Activity5B_Ubungen {

    public static void main(String[] args) {
        LinkedList<String> animals = new LinkedList<>();
        animals.add("Dog");
        animals.add("Horse");
        animals.add("Rabbit");
        animals.addFirst("Cat");
        animals.addLast("Turtle");
        
        System.out.println("Linked List: " + animals);
        System.out.println("First Element: " + animals.getFirst());
        System.out.println("Last Element: " + animals.getLast());
    }
}
