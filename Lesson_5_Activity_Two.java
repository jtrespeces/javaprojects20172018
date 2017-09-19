/*
 * Lesson 5 Coding Activity Question 2
 * 
 * Input four integer values and print the sum of all four values.
 *
*/

import java.util.Scanner;
import java.lang.Math;

class Lesson_5_Activity_Two {
    public static void main(String[] args) {
      
        Scanner scan = new Scanner (System.in);
        int a;
        int b;
        int c;
        int d;
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        d = scan.nextInt();
        
        int abcd = a+b+c+d;
        
        System.out.println(abcd);


    }
}