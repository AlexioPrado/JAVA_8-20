/*
 * Name: Fraction Program
 * Purpose: To determine what type of fraction the user has inputed with the numerator and denominator
 * Date: 8/27/25
 * Author: Marcus Prado
*/

import java.util.Scanner;

public class peer {
    // GCD Function finds the gcd of two numbers
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a%b);
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        // Declaring and initializing variables
        int numerator = 0;
        int denominator = 0;
        // Mixed fraction variables
        int a = 0;
        int b = 0;
        int c = 0;
        // gcd
        int gcd;

        //user input: numerator & denominator
        System.out.print("Enter a numerator: ");
        numerator = input.nextInt();
        System.out.print("Enter a denominator: ");
        denominator = input.nextInt();

        /*
         * If Statement Hiearchy
         * 1. if(num > den)
         *  1a.num % den == 0
         *  2a. 
         * 2. num == den
         * 3. num < den
         */

        if (numerator > denominator) {
            if (numerator % denominator == 0 ){
                System.out.println(numerator + "/" + denominator + " is an improper fraction and can be reduced to " + (numerator/denominator));
            }
            else {
                a = numerator / denominator;
                b = numerator % denominator;
                c = denominator;
                if (c % b == 0) {
                    c /= b;
                    b = 1;
                } else {
                    gcd = gcd(b,c);
                    b = b/gcd;
                    c = c/gcd;
                }
                System.out.println(numerator + "/" + denominator + " is an improper fraction.");
                System.out.print("Its mixed fraction is " + a + "+" + b + "/" + c);
            }
        }
        else if (numerator == denominator) {
            System.out.print(numerator + "/" + denominator + " can be reduced to 1.");
        }
        else if (numerator < denominator) {
            if (denominator % numerator == 0 ) {
                System.out.print(numerator + "/" + denominator + " is a proper fraction and can be reduced to 1/" + (denominator/numerator));
            }
            else {
                gcd = gcd(numerator,denominator);
                System.out.print(numerator + "/" + denominator + " is a proper fraction and can be reduced to " + (numerator/gcd) + "/" + (denominator/gcd));
            }
        }
    }
}
