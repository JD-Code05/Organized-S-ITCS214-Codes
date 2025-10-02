/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arraysample_4;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @John Daniel Ubungen,BCS23
 */
public class ArraySample_4 {
    
    public ArraySample_4() {
        // Declare and create an array size of 100
        int[] arr;
    arr = new int[100];
    int nItems = 10; // number of elements
    int i = 0;// loop counter
    
    // User-defined values into the array using Scanner and using while loop
    Scanner a = new Scanner(System.in);
    
    while (i < nItems) {
        System.out.print("Enter number " + i + ": ");
        arr[i] = a.nextInt();
        i++;
    }
    
    // Display elements of the array
    System.out.print("Elements of the array: ");
    i = 0;
   
    while (i < nItems ) {
        System.out.print(arr[i] + " ");
        i++;
    }
    System.out.println();
    
    // Get the sum of all elements
    int sum = 0;
    i = 0;
    while (i < nItems) {
        sum += arr[i];
        i++;
    }
    // Display the sum of the elements
    System.out.println("The sum of all elements = " + sum);  
    }
    
    public static void main(String[] args) throws IOException {
        // An Object to run the constructor
        ArraySample_4 samp = new ArraySample_4();    
    }
}
