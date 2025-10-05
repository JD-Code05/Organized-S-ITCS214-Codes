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
    // This method lets the user enter values to fill an array of a given size
    public static int[] getArrayFromUser(int arrSize) {
        int[] arr = new int[arrSize]; // ✅ Creates an integer array with the given size
        
        Scanner in = new Scanner(System.in); // ✅ Sets up a Scanner for user input
        
        for (int i = 0; i < arrSize; i++) { // ✅ Loops from 0 to arrSize - 1
            System.out.print("Enter element " + (i + 1) + ": "); // ✅ Prompts the user to input each array element
            arr[i] = in.nextInt(); // ✅ Reads and stores the user’s input into the current array index
        }
        return arr; // ✅ Returns the filled array     
    }

    // This method calculates and returns the total sum of all array elements
    public static int getArraySum(int[] numbers) {
        int totalSum = 0; // ✅ Variable to store the running total of the array elements    
        
        for (int i = 0; i < numbers.length; i++) { // ✅ Loops through the array using its length
            totalSum += numbers[i];  // ✅ Adds each element to totalSum      
        }
        return totalSum; // ✅ Returns the final sum of all elements in the array           
    }

    // This method finds and returns the largest value in the array
    public static int findMax(int[] numbers) {
        int maxValue = numbers[0]; // ✅ Starts by assuming the first element is the largest
        
        for (int i = 1; i < numbers.length; i++) { // ✅ Loops from the second element (index 1)
            
            if (numbers[i] > maxValue) { // ✅ If the current element is greater than the current max
                maxValue = numbers[i];   // ✅ Update maxValue to the new larger number    
            }    
        }
        return maxValue; // ✅ Returns the maximum value found in the array
    }

    // Main method — program execution starts here
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in); // ✅ Creates a Scanner for user input
        System.out.print("Enter the array Size: "); // ✅ Prompts the user to enter how many elements the array will have
        int size = a.nextInt(); // ✅ Reads and stores the user-input size
        
        int[] myArray = getArrayFromUser(size); // ✅ Calls method to get all elements from the user
        int sum = getArraySum(myArray); // ✅ Calls method to calculate total sum
        int max = findMax(myArray); // ✅ Calls method to find the maximum number in the array
        
        double average = (double)sum / size; // ✅ Calculates the average — uses double to include decimals for accuracy
        
        // ✅ Displays the total sum, average (formatted to 2 decimals), and max value
        System.out.println("Total Sum: " + sum);
        System.out.println("The Average is: " + String.format("%.2f", average));
        System.out.println("The Maximum value is: " + max);
        
        a.close(); // ✅ Closes the Scanner to prevent memory leaks
    }    
}
