package ComputerScienceA1A;
/*
 * Lesson 3 Coding Activity Question 2
 * 
 * Write a program that asks the user for three names, then prints the names in reverse order.
 * 
 * Sample Run:

Please enter three names:
Zoey 
Zeb 
Zena 

Zena Zeb Zoey

*/

import java.util.Scanner;
import java.lang.Math;

class Lesson_3_Activity_Two {
    public static void main(String[] args) {
      
        Scanner scan = new Scanner (System.in);
        String a;
        String b;
        String c;
        
        System.out.print("Please enter three names: ");
        a = scan.nextLine();
        b = scan.nextLine();
        c = scan.nextLine();
        System.out.println(c+" "+b+" "+a);
        


    }
}