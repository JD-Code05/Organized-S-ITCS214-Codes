/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.module4_ubungen;

/**
 *
 * @author John Daniel Ubungen
 */
import java.util.Scanner;
public class Module4_Ubungen {

    public static void main(String[] args) {
        int type_of_op;
        
        Mystack ob1 = new Mystack();
        
        Scanner s = new Scanner(System.in);
        
        while (true) {
            System.out.println("STACK OPERATIONS");
            System.out.println("[1] - Push");
            System.out.println("[2] - Pop");
            System.out.println("[3] - Print");
            System.out.println("[4] - Top");
            System.out.println("[5] - Exit");
            
            System.out.print("Enter your Choice: ");
            type_of_op = s.nextInt();
            
            switch (type_of_op) {
            case 1 : System.out.print("Enter Element to Push: ");
            ob1.push(s.nextInt());
            break;
            
            case 2: System.out.print("Enter Element you want to Pop is : " + ob1.pop());
            break;
            
            case 3: System.out.println("Stack Elements are: ");
            ob1.print();
            break;
            
            case 4:
                int top = ob1.top();
                if (top != -1) {
                    System.out.println("The top element is: " + top);
                    break;
                }
            case 5:
                System.out.println("You ended the operations");
                s.close();
                return;
            default:
                System.out.println("Unrecognized Choice");
                return;   
        } 
        }
        
    }
}
class Mystack {
    int[] stacks = new int[10];
    int tos;
    
    Mystack() {
        tos = -1;   
    }
    
    public void push(int item) {
        if (tos == 9) {
            System.out.println("The stack is full");
        } else {
            stacks[++tos] = item;
            
        }
    }
    public int pop() {
        if (tos < 0) {
            System.out.println("Stack underflow");
            return -1;
        } else {
            return stacks[tos--];
        }
    }
    public boolean empty_stack() {
     return tos == -1;
    }
    public int top() {
        if (tos < 0) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return stacks[tos];
        }
    }
    public void print(){
        if(!empty_stack()) {
        int temp = pop();
        System.out.println(temp);
        print();
        push(temp);
    }
}
    
    
}

