/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.m_activity4a_ubungen;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @Ubungen, John Daniel, BCS23 */
public class M_Activity4A_Ubungen {
    
    public M_Activity4A_Ubungen() {
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
    System.out.print("\nEnter the index number to retrieve: ");
    int index = as.nextInt();
    
    if (index >= 0 && index < nItems) {
        System.out.println("Element at index " + index + ": " + arr[index]);
    } else {
        System.out.println("Invalid index! Must be between 0 and " + (nItems - 1));
    }
    }

    public static void main(String[] args) throws IOException {
        M_Activity4A_Ubungen sa = new M_Activity4A_Ubungen();
    }
}
