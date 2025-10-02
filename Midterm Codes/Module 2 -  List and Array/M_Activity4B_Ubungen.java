/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.m_activity4b_ubungen;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author student
 */
public class M_Activity4B_Ubungen {
    public M_Activity4B_Ubungen() {
        Scanner as = new Scanner(System.in);
        int[] arr;
    arr = new int[100];
    int nItems = 10;
    
    System.out.println("Enter " + nItems + " elements in the array: ");
    for (int i = 0; i < nItems; i++) {
        arr[i] = as.nextInt();
    }
    System.out.print("Elements of the array: ");
    for (int i = 0; i < nItems; i++) {
        System.out.print(arr[i] + " ");
    }
    System.out.print("\nEnter the number to search: ");
    int searchNum = as.nextInt();
    
    int foundIndex = -1;
    for (int i = 0; i < nItems; i++) {
        if (arr[i] == searchNum) {
            foundIndex = i;
            break;
        }
    }
    if (foundIndex != -1) {
        System.out.println(searchNum + " is found at index " + foundIndex);
    } else {
        System.out.println(searchNum + " is not found in the array.");
    }
    
    }
    

    
    public static void main(String[] args) throws IOException {
        M_Activity4B_Ubungen sa = new M_Activity4B_Ubungen();
        
    }
}
