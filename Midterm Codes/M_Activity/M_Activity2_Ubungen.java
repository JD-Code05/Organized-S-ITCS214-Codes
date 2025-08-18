/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.m_activity2_ubungen;

/**
 *
 * Ubungen, John Daniel L, BCS23
 */
public class M_Activity2_Ubungen {
    public static int power (int base, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }
    

    public static void main(String[] args) {
        int base = 3;
        int exponent = 4;
        
        System.out.println(base + " raised to " + exponent + " is = " + power(base, exponent));   
    }
}
