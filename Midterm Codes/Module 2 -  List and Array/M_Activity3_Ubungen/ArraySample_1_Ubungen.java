/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arraysample_1;

import java.io.IOException;

/**
 *
 * @John Daniel Ubungen,BCS23
 */
public class ArraySample_1 {
    
    public ArraySample_1() {
        // Declare and create an array size of 100
        int[] arr;
    arr = new int [100];
    int nItems = 10; // number of elements
    int i; // loop counter
    
    // Elements and there assigned values 
    arr[0] = 5;
    arr[1] = 10;
    arr[2] = 15;
    arr[3] = 50;
    arr[4] = 56;
    
    // Display the elements of the array
    System.out.print("Elements of the array: ");
    for(i=0; i<nItems; i++)
        System.out.print(arr[i] + " ");
    }
    
    public static void main(String[] args) throws IOException {
        // An Object to run the constructor
        ArraySample_1 samp = new ArraySample_1();   
    }
}
