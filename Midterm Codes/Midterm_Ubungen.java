/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.midterm_ubungen;

/**
 *
 * @author student
 */
import java.util.*;
public class Midterm_Ubungen {
    

    public static void main(String[] args) {
        Scanner as = new Scanner(System.in);
        System.out.print("Enter the size of the stack: ");
        int size = as.nextInt();as.nextLine();
        
        Mystack ob1 = new Mystack(size);
        
        System.out.println("Push the element on the stack");
        for (int i = 0; i < size; i++) {
            String words = as.nextLine();
            ob1.push(words);
        }
        System.out.println("The popped element is " + ob1.pop());
        
        System.out.println("The Stack: ");
        ob1.print();
 
        System.out.println("The top element is " + ob1.top());

    } 
}
class Mystack {
        String [] stacks;
        int total;
        int size;
        Mystack(int size) {
            this.size = size;
            stacks = new String[size];
            total = -1;
        }
        public void push (String item) {
            if (total == size - 1) {
                System.out.println("Stack is full");
            } else {
                total++;
                stacks[total] = item;
            }
        }
        public String pop() {
            if (total < 0) {
                System.out.println("Stack is empty");
                return null;
            } else {
                return stacks[total--];
                
            }
        }
        public boolean emptyStack() {
           return total == -1; 
        }
        public void print() {
            if(emptyStack()){
                return;
            }
        
        String temp = pop();
        print();
        System.out.println(temp);
        push(temp);
        }
        public String top() {
        if (total < 0) {
            System.out.println("Stack underflow");
            return null;
        } else {
            return stacks[total];
        }
    }
    }
    

