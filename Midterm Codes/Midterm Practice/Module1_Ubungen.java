/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.module1_ubungen;

/**
 *
 * @author John Daniel Ubungen
 */

import java.util.Scanner;

public class Module1_Ubungen {
    // Method to get the total number of digits in a given number
    public static int getLength(int n) {
        int count = 0; // variable to count how many digits
        
        // loop continues while n is greater than 0
        while (n > 0) {
            n /= 10;   // removes the last digit of n (example: 123 → 12)
            count++;   // adds 1 to count each time a digit is removed
        }
        return count;  // returns the total number of digits
    }

    // Method to calculate base raised to exponent (like Math.pow)
    public static int getPower(int base, int exponent) {
        int result = 1; // starts at 1 since anything times 1 stays the same
        
        // loop repeats 'exponent' times
        for (int i = 0; i < exponent; i++) {
            result *= base;  // multiplies result by base each time
        }
        return result;  // returns the final result of base^exponent
    }

    // Method to check if a number is an Armstrong number
    public static void isArmstrong(int n) {
        int length = getLength(n); // gets how many digits the number has
        int temp = n;              // copy of n to manipulate without losing the original
        int sum = 0;               // stores the sum of each digit raised to the power of length
        
        // extract each digit and calculate (digit^length)
        while (temp > 0) {
            int digits = temp % 10;           // gets the last digit (example: 153 → 3)
            sum += getPower(digits, length);  // adds (digit^length) to the sum
            temp /= 10;                       // removes the last digit (example: 153 → 15)
        }
        
        // compare the computed sum with the original number
        if (sum == n) {
            System.out.println("This is an Armstrong Number");
        } else {
            System.out.println("This is not an Armstrong Number");
        }
    }

    // Main method - program starts here
    public static void main(String[] args) {
        int number;
        Scanner as = new Scanner(System.in); // creates a Scanner for user input
        
        // allows user to enter 5 numbers to check
        for (int N = 0; N < 5; N++) {
            System.out.print("Enter a number: ");
            number = as.nextInt(); // reads user input number
            isArmstrong(number);   // calls method to check if it’s Armstrong
        }
        
        as.close(); // closes the scanner to free up resources
    } 
}
