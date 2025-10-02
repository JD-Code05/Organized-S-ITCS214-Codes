/* Write a program containing the following user-defined methods. You are not allowed to use built-in
   methods in Java.

   Method that returns the power of a given base and exponent. If the value submitted to the method is
   3 for base and 4 for exponent then the method should return 81 because 3 raised to 4  is 81.

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.m_activity2_ubungen;

/**
 *
 * Ubungen, John Daniel L, BCS23
 */
public class M_Activity2_Ubungen {

   // This method calculates base^exponent (base raised to exponent)
    public static int power (int base, int exponent) {
        int result = 1; // Start with result = 1 (multiplicative identity)

       // Loop runs 'exponent' times, multiplying base each iteration
        for (int i = 0; i < exponent; i++) { 
            result *= base; // Multiply result by base
        }
        return result; // Final result is returned after exponent multiplications
    }
    

    public static void main(String[] args) {
       // Define the base and exponent values
        int base = 3;
        int exponent = 4;

       // Call the power method and display the result
       // Output format: "base raised to exponent is = result"
        System.out.println(base + " raised to " + exponent + " is = " + power(base, exponent));   
    }
}
