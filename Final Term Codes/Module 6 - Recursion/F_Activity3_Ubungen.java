/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.f_activity3_ubungen;

/**
 *
 * @author student
 */
import java.util.*;

public class F_Activity3_Ubungen {
    public static int factorial(int n) {
        if(n==1)
            return 1;
        else
            return (2 * n - 1) + factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner rs = new Scanner (System.in);
        int num;
        
        do {
            System.out.print("Enter value of n: ");
            num = rs.nextInt();
        } while (num < 1);
        System.out.print("Sum of the first " + num + " positive odd integers = " + factorial(num));
        
    }
}
