/*
 * Marcus Alexio Prado
 * Period 2
 * 9/3/25
 */

import java.util.Scanner;

public class keypad {
    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);

        //Variables 
        String letter;
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int index;

        //Letter User input
        System.out.print("Enter a letter: ");
        letter = keyboard.next();

        //Find the index comparing user input and alphabet string
        index = alphabet.indexOf(letter.toUpperCase()) + 1;

        //find if index is in ___ ranges, output corresponding number
        if (index >= 1 & index <= 3){
            System.out.print("Your corresponding number is 2");
        }
        else if (index >= 4 & index <= 6){
            System.out.print("Your corresponding number is 3");
        }
        else if (index >= 7 & index <= 9){
            System.out.print("Your corresponding number is 4");
        }
        else if (index >= 10 & index <= 12){
            System.out.print("Your corresponding number is 5");
        }
        else if (index >= 13 & index <= 15){
            System.out.print("Your corresponding number is 6");
        }
        else if (index >= 16 & index <= 19){
            System.out.print("Your corresponding number is 7");
        }
        else if (index >= 20 & index <= 22){
            System.out.print("Your corresponding number is 8");
        }
        else if (index >= 23 & index <= 26){
            System.out.print("Your corresponding number is 9");
        }

        keyboard.close();
    }
}
