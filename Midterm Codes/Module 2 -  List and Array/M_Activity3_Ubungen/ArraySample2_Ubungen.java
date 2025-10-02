/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arraysample_2;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @John Daniel Ubungen,BCS23
 */
public class ArraySample_2 {
    
    public ArraySample_2() {
        // Declare and create an array size of 100
        int[] arr;
    arr = new int[100];
    int nItems = 10; // number of elements
    int i;// loop counter
    
    //User-defined values into the array using Scanner and using for loop
    for (i=0; i<nItems; i++) {
        System.out.print("Enter number " + i + ": ");
        Scanner a = new Scanner(System.in);
        arr[i] = a.nextInt();
    }
    
    // Display elements of the array
    System.out.print("Elements of the array: ");
    for(i=0; i<nItems; i++)
        System.out.print(arr[i] + " ");
    }

    public static void main(String[] args) throws IOException {
        // An Object to run the constructor
        ArraySample_2 samp = new ArraySample_2();
    }
}
