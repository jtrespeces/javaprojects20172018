/*
 * Lesson 7 Coding Activity Question 1
 *
 * Input a positive three digit integer. Print out the digits one per line.
 *
 * Sample run:
 
Please enter a three digit number:
678

Here are the digits:
6
7
8

*/

import java.util.Scanner;
import java.lang.Math;

class Lesson_7_Activity_One {
    public static void main(String[] args) {
        int b, c, d, e, f;
        Scanner scan = new Scanner (System.in);
        System.out.println("Please enter a three digit number: ");
        int a = scan.nextInt();
        
        
        c = (int) ((int) (a / 1000)) - (10);
        d = ((int) (a / 100)) - (100 + c * 10);
        e = ((int) (a / 10)) - (1000 + c * 100 + d * 10);
        f = a - (10000 + c * 1000 + d * 100 + e * 10);
        System.out.println("Here are the digits: ");
        

        
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        
        
        


    }
}