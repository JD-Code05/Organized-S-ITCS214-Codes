/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.m_activity7_ubungen;
import java.util.Scanner;
/**
 *
 * @Ubungen, John Daniel L. BCS23
 */
public class M_Activity7_Ubungen {

    public static void main(String[] args) {
        int operation;
        
        Mystack ob1 = new Mystack();
        
        Scanner s = new Scanner(System.in);
        
        while (true) {
            System.out.println(" STACK OPERATIONS");
            System.out.println("[1] - Push");
            System.out.println("[2] - Pop");
            System.out.println("[3] - Print");
            System.out.println("[4] - Top");
            System.out.println("[5] - Exit");
            System.out.print("Enter your Choice: ");
            
            operation = s.nextInt();
            
            switch(operation) {
                case 1: System.out.print("Enter Element to Push: ");
                    ob1.push(s.nextInt());
                    break;
                case 2: System.out.print("Element you want to Pop is : "+ ob1.pop());
                    break;
                case 3: System.out.println("Stack element are: ");
                    ob1.print();
                    break;
                case 4: 
                    int top = ob1.top();
                    if(top != -1) {
                        System.out.println("The top element is: " + top);
                        break;
                    }
                case 5:
                    System.out.println("You ended it");
                    s.close();
                    return;
                default: System.out.println("Unrecognized Choice");
                    return;
            
        }    
        } 
    }
}
    class Mystack {
        int stack_elements[] = new int[10];
        int tos;
        Mystack() {
            tos = -1;
        }

    public void push(int item) {
        if(tos == 9) {
            System.out.println("Stack is Full");
        } else {
            stack_elements[++tos] = item;
        }
    }
    public int top() {
        if (tos < 0) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return stack_elements[tos];
        }
    }
    public int pop(){
        if(tos<0) {
            System.out.println("Stack Underflow");
            return 0;
        } else 
            return stack_elements[tos--];
    }
    public boolean empty_stack() {
            return tos == -1;
    }
    public void print(){
        int temp = 0;
        if(!empty_stack()) {
            temp = pop();
            System.out.println(temp);
            print();
        }
        push(temp);
    }

}
