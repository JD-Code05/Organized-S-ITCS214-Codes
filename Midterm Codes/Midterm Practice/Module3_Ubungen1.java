/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.module3_ubungen1;

/**
 *
 * @author John Daniel Ubungen
 */
import java.util.Scanner;
import java.util.LinkedList;

public class Module3_Ubungen1 {
    // Method that allows user to insert elements into a LinkedList while keeping it sorted
    public static void insertSort(LinkedList<Integer> linkListName) {
        Scanner sc = new Scanner(System.in); // ✅ Scanner for user input
        
        while (true) { // ✅ Infinite loop until user decides to stop
            System.out.print("\nInput Element to insert: ");
            int value = sc.nextInt(); // ✅ Reads the number to insert
            int index = 0; // ✅ Will be used to find the correct position in the list
            
            // ✅ Find the correct index where 'value' should be inserted to maintain sorted order
            while (index < linkListName.size() && linkListName.get(index) < value) {
                index++; // ✅ Move forward until you find an element greater than or equal to 'value'
            }
            
            // ✅ Insert the new value at the correct position (shifts other elements to the right)
            linkListName.add(index, value);
            
            // ✅ Display the updated linked list after insertion
            System.out.println("Linked List Elements: " + linkListName);
            
            // ✅ Ask if the user wants to continue inserting more values
            System.out.print("\nDo you want to insert again? (Y/N): ");
            String ans = sc.next().trim(); // ✅ Reads user's choice and removes extra spaces
            
            // ✅ If user enters anything other than 'Y' or 'y', exit the loop
            if (!ans.equalsIgnoreCase("Y")) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        // ✅ Create a LinkedList with initial elements already in sorted order
        LinkedList<Integer> num = new LinkedList<>();
        
        num.add(2);
        num.add(5);
        num.add(8);
        num.add(12);
        
        // ✅ Display the starting list
        System.out.println("Linked List Elements: " + num);
        
        // ✅ Call the insertSort method to let the user insert new elements
        insertSort(num);
    }
}
