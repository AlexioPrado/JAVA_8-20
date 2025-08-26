import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        System.out.println("Hello");

        // initiating & declaring variables
        // numerical data types: byte, short, int, long, float, double
        // float has 7 digits while double has 16.
        // Numeric operatores: + - * / &->remainder
        // Exponent: Math.pow(x,y);
        // Augmented Assignment Operators: += -= *= /= &=
        
        // Number literals: Literals is the actual value of the variable
        // when using char, use single quotation marks
        // final must be initialized and declared on the same line. Final means constant
        int radius;
        radius = 20;
        System.out.println(radius);


        // Using Scanner/user input
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number for the numerator");
        double numerator = keyboard.nextDouble();
        double ans = numerator%3;
        System.out.println(ans);

    }
}