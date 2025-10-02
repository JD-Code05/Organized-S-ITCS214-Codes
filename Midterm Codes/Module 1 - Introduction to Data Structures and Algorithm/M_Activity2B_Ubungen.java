/* Method that determines whether a given parameter n is an Armstrong number or not. 
   This method will call the methods created in 1 and 2.A number (n) is said to be an Armstrong number 
   if the sum of the nth powers of each of its digits is equal to the number (n).

   Write a program containing the following user-defined methods. You are not allowed to use built-in
   methods in Java


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.m_activity3_ubungen;

/**
 *
 * Ubungen, John Daniel L, BCS23
 */
public class M_Activity3_Ubungen {
    public static int numberLength (int number) {
        int count = 0;
        
        while(number > 0) {
            number /= 10;
            count++;
        }
        return count;
    }
    public static int power (int base, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }
    
    public static void armstrongChecker (int number) {
        int digits = numberLength(number);
        int temp = number;
        int sum = 0;
        
        while (temp > 0) {
            int digit = temp % 10;
            sum += power (digit, digits);
            temp /= 10;
        }
        if (sum == number) {
            System.out.println(number + " is an Armstrong number");
        } else {
            System.out.println(number + " is not an Armstrong number");
        }
    }
    public static void main(String[] args) {
        armstrongChecker (370);
        armstrongChecker (25);
        armstrongChecker (9470);      
    }
}
