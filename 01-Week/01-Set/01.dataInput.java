/*
Write a program that takes an integer, then a string, then a char from the user and prints them on the screen.

Input:  2 Name y
Expected Output:
2
Name
y
*/

import java.util.Scanner;

public class dataInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking inputs
        int number = input.nextInt();
        String text = input.next();
        char letter = input.next().charAt(0);

        // Printing outputs
        System.out.println(number);
        System.out.println(text);
        System.out.println(letter);

        input.close();
    }
}
