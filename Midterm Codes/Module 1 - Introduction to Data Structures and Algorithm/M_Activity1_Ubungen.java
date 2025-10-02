/*  Write a program containing the following user-defined methods. You are not allowed to use built-in
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
    public static int numberLength (int number) {
        int count = 0;
        
        while(number > 0) {
            number /= 10;
            count++;
        }
        return count;
    }     

    public static void main(String[] args) {
        int num = 85263;
        
        System.out.println("The length of " + num + " is: " + numberLength(num));
    }
}
