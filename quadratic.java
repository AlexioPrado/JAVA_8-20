/*
 * Marcus Alexio Prado
 * Period: 2
 * 8/26/25
 */

import java.util.Scanner;

public class quadratic {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        // QUADRATIC VALUES
        System.out.print("Enter a number for 'a' value: ");
        double a = input.nextDouble();
        System.out.print("Enter a number for 'b' value: ");
        double b = input.nextDouble();
        System.out.print("Enter a number for 'c' value: ");
        double c = input.nextDouble();
        
        // CREATE DISCRIMINANT
        double discriminant = 0.0;
        discriminant = Math.pow(b,2)-(4*a*c);
        double rootOne;
        double rootTwo;

        // Discriminant if greater than 0, equal to 0, or less than 0
        if(Math.pow(b,2) - (4*a*c) < 0) {
            System.out.print("The equation has no real roots.");
        }
        else if (Math.pow(b,2) - (4*a*c) == 0) {
            double root = (-b/(2*a));
            System.out.print("The root is " + root);
        }
        else {
            rootOne = (-b+Math.pow(discriminant,0.5))/(2*a);
            rootTwo = (-b-Math.pow(discriminant,0.5))/(2*a);
            System.out.print("The roots are " + rootOne + "and " + rootTwo);
        }

        //closing scanner
        input.close();
    }
}
