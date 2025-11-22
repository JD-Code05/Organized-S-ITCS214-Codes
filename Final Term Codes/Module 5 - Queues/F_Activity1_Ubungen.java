/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.f_activity1_ubungen;

import java.io.*;

/**
 *
 * @author John Daniel Ubungen
 */
public class F_Activity1_Ubungen {
    
    static int i, front, rear, item, max = 10, ch;
    static int a[] = new int[10];

    F_Activity1_Ubungen() {
        front = -1;
        rear = -1;
    }

    public static void main(String[] args) throws IOException {
        
         while ((boolean) true) {
            try {
                System.out.println("Select Option: 1.insert 2.delete 3.display 4.Exit: ");

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                ch = Integer.parseInt(br.readLine());
            } catch (Exception e) {
            }

            if (ch == 4)
                break;
            else {
                switch (ch) {
                    case 1:
                        insert();
                        break;
                    case 2:
                        delete();
                        break;
                    case 3:
                        display();
                        break;
                }
            }
        }

    }

    static void insert() {
        if (rear >= max - 1) {
            System.out.println("Queue is Full");
        } else {
            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the Element: ");
                item = Integer.parseInt(br.readLine());
            } catch (Exception e) {
            }
            rear = rear + 1;
            a[rear] = item;
        }

    }

    static void delete() {
        if (front == -1) {
            System.out.println("Queue is Empty");
        } else {
            front = front + 1;
            item = a[front];
            System.out.println("Deleted Item: " + item);
        }
    }

    static void display() {
        System.out.println("Elements in the Queue are:");
        for (int i = front + 1; i <= rear; i++) {
            System.out.println(a[i]);
        }
    }
}
