package ComputerScienceA1A;
/*
 * Lesson 3 Coding Activity Question 3
 * 
 * Write a program that will ask the user to enter an adjective and a name. 
 * Print the following sentence, replacing the ______ with the words they entered.
 * 
 * My name is _____. I am _____.
 *
 * Sample Run:

Hi there. What is your name?
Ada
What adjective describes you?
logical
My name is Ada. I am logical.

*/

import java.util.Scanner;
import java.lang.Math;

class Lesson_3_Activity_Three {
    public static void main(String[] args) {
      
        Scanner scan = new Scanner (System.in);
        String a;
        String b;
        
        System.out.println("Hi there. What is your name?");
        a = scan.nextLine();
        System.out.println("What adjective describes you?");
        b = scan.nextLine();
        
        System.out.println("My name is "+a+". I am "+b+".");

    }
}