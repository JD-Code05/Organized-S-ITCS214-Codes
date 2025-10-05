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
        int type_of_op; // ✅ variable to store the user's chosen operation
        
        Mystack ob1 = new Mystack(); // ✅ creates a new stack object
        
        Scanner s = new Scanner(System.in); // ✅ sets up Scanner to read user input
        
        while (true) { // ✅ infinite loop until user chooses to exit
            // ✅ displays the list of operations the user can perform
            System.out.println("\nSTACK OPERATIONS");
            System.out.println("[1] - Push");
            System.out.println("[2] - Pop");
            System.out.println("[3] - Print");
            System.out.println("[4] - Top");
            System.out.println("[5] - Exit");
            
            System.out.print("Enter your Choice: ");
            type_of_op = s.nextInt(); // ✅ reads the user's menu choice
            
            switch (type_of_op) {
                case 1:
                    // ✅ pushes (adds) an element to the top of the stack
                    System.out.print("Enter Element to Push: ");
                    ob1.push(s.nextInt());
                    break;
                    
                case 2:
                    // ✅ pops (removes) the top element from the stack
                    System.out.println("Element popped: " + ob1.pop());
                    break;
                    
                case 3:
                    // ✅ prints all stack elements
                    System.out.println("Stack Elements are:");
                    ob1.print();
                    break;
                    
                case 4:
                    // ✅ shows the current top element of the stack
                    int top = ob1.top();
                    if (top != -1) { // ✅ checks if stack is not empty
                        System.out.println("The top element is: " + top);
                    }
                    break;
                    
                case 5:
                    // ✅ ends the program
                    System.out.println("You ended the operations");
                    s.close();
                    return; // ✅ exits the main method
                    
                default:
                    // ✅ handles invalid menu input
                    System.out.println("Unrecognized Choice");
                    return;   
            } 
        }
    }
}

// ✅ Mystack class defines the stack structure and its operations
class Mystack {
    int[] stacks = new int[10]; // ✅ array that holds stack elements (max size = 10)
    int tos; // ✅ 'tos' means top of stack (index of last pushed element)
    
    // ✅ constructor initializes 'tos' to -1 (empty stack)
    Mystack() {
        tos = -1;   
    }
    
    // ✅ adds an element to the top of the stack
    public void push(int item) {
        if (tos == 9) { // ✅ checks if stack is already full
            System.out.println("The stack is full");
        } else {
            stacks[++tos] = item; // ✅ increments tos then stores the item
        }
    }

    // ✅ removes and returns the top element from the stack
    public int pop() {
        if (tos < 0) { // ✅ checks if the stack is empty
            System.out.println("Stack underflow");
            return -1;
        } else {
            return stacks[tos--]; // ✅ returns top element and decreases tos
        }
    }

    // ✅ checks if the stack is empty
    public boolean empty_stack() {
        return tos == -1; // ✅ returns true if no elements
    }

    // ✅ returns the top element without removing it
    public int top() {
        if (tos < 0) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return stacks[tos]; // ✅ just returns value at top index
        }
    }

    // ✅ prints all elements in the stack (from top to bottom)
    public void print() {
        if (!empty_stack()) { // ✅ recursive approach: print until stack is empty
            int temp = pop(); // ✅ temporarily remove top element
            System.out.println(temp); // ✅ print it
            print(); // ✅ recursive call to print the rest
            push(temp); // ✅ push it back to restore original stack
        }
    }
}
