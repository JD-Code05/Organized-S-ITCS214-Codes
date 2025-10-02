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
