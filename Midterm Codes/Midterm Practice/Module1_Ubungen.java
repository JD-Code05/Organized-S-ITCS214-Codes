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
    public static int getLength(int n) {
        int count = 0;
        
        while (n > 0) {
            n /= 10;
            count++;
        }
        return count;
    }
    public static int getPower(int base, int exponent) {
        int result = 1;
        
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
        
    }
    
    public static void isArmstrong(int n) {
        int length = getLength(n);
        int temp = n;
        int sum = 0;
        
        while (temp > 0) {
            int digits = temp % 10;
            sum += getPower(digits, length);
            temp /= 10;
        }
        if (sum == n) {
            System.out.println("This is an Armstrong Number");
        } else {
            System.out.println("This is not an Armstrong Number");
        }
        
    }
    

    public static void main(String[] args) {
        int number;
        Scanner as = new Scanner(System.in);
        
        for (int N = 0; N < 5; N++) {
            System.out.print("Enter a number: ");
            number = as.nextInt();
            isArmstrong(number);    
        }
        
        as.close();  
    } 
}
