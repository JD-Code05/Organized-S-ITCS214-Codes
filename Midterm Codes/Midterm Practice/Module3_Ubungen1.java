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
    public static void insertSort(LinkedList<Integer> linkListName) {
        Scanner sc = new Scanner(System.in);
        
        while(true) {
            System.out.print("\n Input Elements to insert: ");
            int value = sc.nextInt();
            int index = 0;
            
            while (index < linkListName.size() && linkListName.get(index) < value) {
                index++;
            }
            linkListName.add(index, value);
            System.out.println("Linked List Elements: " + linkListName);
            
            System.out.print("\nDo you want to insert again? (Y/N): ");
            String ans = sc.next().trim();
            if(!ans.equalsIgnoreCase("Y")) {
                break;
            }
        }
        
    }
    public static void main(String[] args) {
        LinkedList<Integer> num = new LinkedList<>();
        
        num.add(2);
        num.add(5);
        num.add(8);
        num.add(12);
        
        System.out.println("Linked List Element " + num);
        insertSort(num);
  
        
    }
}
