/*
 * Marcus Alexio Prado 
 * 9/11/25
 * Period 2
 * Purpose: Get a string of numbers and check which is the greatest number and how much it occurs
 */

import java.util.Scanner;

public class maxValue{
    public static void main(String args[]){
        // Scanner
        Scanner input = new Scanner(System.in);

        // Variables 
        String numList;
        int listLength;
        int greatestNum = 0;
        int count = 1;
        int outputVar = 0;

        // User Input
        System.out.print("Enter numbers: ");

        // put input in numList and find length of input
        numList = input.nextLine();
        listLength = numList.length();

        // Loop through numList 
        for (int i = 0; i < listLength; i += 2){
            int check = numList.charAt(i);

            if (check == greatestNum){
                count += 1;
            }
            else if (check > greatestNum) {
                greatestNum = check;
                outputVar = i;
                count = 1;
            }
        };

        System.out.println("The largest  number is " + numList.charAt(outputVar));
        System.out.println("The occurence count of the largest number is " + count);

        input.close();
    }
}