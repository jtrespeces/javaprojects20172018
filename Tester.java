/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computersciencea1a;

/**
 *
 * @author q2523
 */
import java.util.Scanner;
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        double val = scan.nextDouble();
        System.out.println(val - 11.5);
        double aaa = Math.pow(4.2,3);
        
        System.out.println(aaa);
        double xsw = -97.6;
        System.out.println((int)Math.abs(xsw));
        
        System.out.println("Answer: "+9+8);
        String a = "%";
        System.out.println(a);
        int x = 56;
        int s = (int)Math.sqrt(49);
        System.out.println(s);
        
        int y = 30;
        System.out.print ("Answer = " + x + y);
        
        double num = 2.0 * (46.75 -  40);
        System.out.println(num);
        
        double num1 = ( 0 - 5 ) * 3 ;
        System.out.println(num1);
        
        int xxx = -3;
        xxx++;
        xxx++;
        xxx--;
        System.out.println(xxx);

        int xe = 18;
        xe++;
        xe++;
        xe-=5;
        xe*=2;
        xe--;
        System.out.println(xe);
        int r = (x*x+x)/x;
        
        System.out.println(r);
        
        int sa = 89;
        double xa = 78.2347;
        System.out.println((int) xa);
        int aasd = 89;
        double xas = 78.2347;
        System.out.println(aasd/2);
        
        int dou=11/2;
        double ble = (double) dou;
        
        System.out.println(ble);
    }
    
}
