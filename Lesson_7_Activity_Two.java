/*
 * Lesson 7 Coding Activity Question 2
 *
 * Change the last problem so that it also prints the sum of the digits. 
 * Use the format shown below.
 *
 * Make sure your output is printed in the same order as the sample run.
 *
 * Sample run:
 
Please enter a three digit number:
678

Here are the digits:
6
7
8

6 + 7 + 8 = 21

*/

import java.util.Scanner;
import java.lang.Math;

class Lesson_7_Activity_Two {
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
        
        b = d+e+f;
        
        

        
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        
        System.out.println(d+" + "+e + " + " + f+" = "+b);


    }
}