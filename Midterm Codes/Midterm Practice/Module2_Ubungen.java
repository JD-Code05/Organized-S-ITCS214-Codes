/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.module2_ubungen;

/**
 *
 * @author John Daniel Ubungen
 */
// Methods That is need:
// public static int[] getArrayFromUser(int arraySize)
//  - Handles User Input and Array Creation 
//
// public static int getArraySum(int[] numbers) 
//  - Calculates the sum of all Elements
//
// public static int findMax(int[] numbers)
//  - Finds the Maximum(Highest Value)

import java.util.Scanner;

public class Module2_Ubungen {
    public static int[] getArrayFromUser(int arrSize) {
        int[] arr = new int[arrSize]; //create an array
        
        Scanner in = new Scanner(System.in); //Setting up the scanner for the user's input
        
        for (int i = 0; i < arrSize; i++) { //Looping through the arrSize
            System.out.print("Enter element " + (i + 1) + ": "); //Let the user input the array
            arr[i] = in.nextInt(); // It will wait for every time the user will input then store it.
        }
        return arr; //returning the array.     
    }
    
    public static int getArraySum(int[] numbers) {
        int totalSum = 0; //create the variable for the sum;    
        
        for (int i = 0; i < numbers.length; i++) { //Looping through the range using numbers.length
            totalSum += numbers[i];  //Adding all of the elements in the array      
        }
        return totalSum; //returning the total Sum of the array           
    }
    
    public static int findMax(int[] numbers) {
        int maxValue = numbers [0]; //initialize the first index of the array which starts at 0
        
        for (int i = 1; i < numbers.length; i++) { 
            
            if (numbers[i] > maxValue) { //if the number at the current index is larger than the largest number
                maxValue = numbers[i];   // Then it will update and get the new maxNumber in the array    
        }    
    }
        return maxValue; // returning the max value of the array
    }

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in); //Setting up the scanner for user's input of size
        System.out.print("Enter the array Size: "); //Let the user enter the size of the array
        int size = a.nextInt(); //It updates the size of the array
        
        int[] myArray = getArrayFromUser(size); // Gets the size of the array;
        int sum = getArraySum(myArray); // Gets the sum of the array;
        int max = findMax(myArray); // Gets the max value of the array;
        
        double average = (double)sum / size; //we use double so that we can have decimal and a more accurate average;
        
        //Displays the final Sum, average, and max value of the array.
        System.out.println("Total Sum: " + sum);
        System.out.println("The Average is: " + String.format("%.2f", average));
        System.out.println("The Maximum value is: " + max);
        
        a.close();
    }    
}
