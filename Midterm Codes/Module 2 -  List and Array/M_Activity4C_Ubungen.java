/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.m_activity4c_ubungen;

import java.util.Scanner;

/**
 *  
 * @Ubungen, John Daniel, BCS23
 */
public class M_Activity4C_Ubungen {

    public static void main(String[] args) {
        Scanner pc = new Scanner(System.in);
        
        System.out.print("Enter the truth value of p: ");
        char p= pc.next().toUpperCase().charAt(0);
        
        System.out.print("Enter the truth value of q: ");
        char q = pc.next().toUpperCase().charAt(0);
        
        String[] operators = {
            "[A] And/Conjunction",
            "[O] Inclusive Or  / Disjunction",
            "[E] Exclusive Or",
            "[C] Conditional/Implication",
            "[B] Biconditional"   
        };
        
        System.out.println ("\nChoose the logical operator");
        for(String option: operators) {
            System.out.println(option);
        }
        
        System.out.print("\n Enter your choice: ");
        char choice = pc.next().toUpperCase().charAt(0);
        
        char result = 'F';
        String operator = " ";
        
        switch (choice) {
            case 'A':
                result = (p == 'T' && q == 'T') ? 'T' : 'F';
                operator = "and";
                break; 
            case 'O':
                result = (p == 'T' || q == 'T') ? 'T' : 'F';
                operator = "or";
                break;
            case 'E':
                result = (p != q)? 'T' : 'F';
                operator = "xor";
                break;
            case 'C':
                result = (p == 'T' && q == 'F') ? 'F' : 'T';
                operator = "implies";
                break;
            case 'B':
                result = (p == q) ? 'T' : 'F';
                operator = "if and only if";
                break;
            default:
                System.out.println("Invalid choice");
                return;
                
        }
        System.out.println("\nOutput: " + p + " " + operator + " " + q + " is equal to " + result);     
    }
}
