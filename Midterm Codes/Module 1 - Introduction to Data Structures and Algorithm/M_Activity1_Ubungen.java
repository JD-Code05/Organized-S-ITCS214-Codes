/* 
Write a program containing the following user-defined methods. You are not allowed to use built-in
methods in java.
    
Method that returns the length of an n-digit parameter. If the value submitted to the method is
85263 then your program should return 5 because 85263 is a 5-digit number

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.m_activity1_ubungen;

/**
 *
 * Ubungen, John Daniel L, BCS23
 */
public class M_Activity1_Ubungen {
    // This method takes an integer as input and returns how many digits it has
    public static int numberLength (int number) {
        int count = 0; // counter to keep track of the number of digits

        // Keep dividing the number by 10 until it becomes 0
        // Each division removes the last digit of the number
        while(number > 0) {
            number /= 10; // remove the last digit
            count++;      // increase digit count
        }
        return count; // Return the total number of digits
    }     

    public static void main(String[] args) {
        int num = 85263; // the number we want to check(hard-coded)

        // Print the result using the numberLength method
        System.out.println("The length of " + num + " is: " + numberLength(num));
    }
}
