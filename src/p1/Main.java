package p1;

/*
 * Program to simulate ordering sandwiches at Jimmy John's
 * Demo program for CIS 150
 * Eric Mailman
 * 21Jan16
 * Version 1.0
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        char option;
        double price;

        System.out.println("Welcome to Jimmy Johns\nWhat would you like?");
        do {
            // Prompt the user for a choice
            System.out.println("(H)am");
            System.out.println("(R)oast Beef");
            System.out.println("(S)alami");
            System.out.println("(T)una");
            System.out.println("(D)one");
            System.out.print("Enter your choice: ");

            // Get the user input and convert to upper case
            String choice = input.next();
            choice = choice.toUpperCase();

            // Store the first letter in a char
            option = choice.charAt(0);

            // Switch based on the option
            switch (option) {
                // Ham
                case 'H':
                    price = 6.50;
                    break;

                // Roast beef
                case 'R':
                    price = 6.75;
                    break;

                // Salami
                case 'S':
                    price = 6.25;
                    break;

                // Tuna
                case 'T':
                    price = 5.50;
                    break;

                // Done
                case 'D':
                    price = 0;
                    break;

                default:
                    System.out.println("Option " + choice + " is not available");
                    price = 0;
            }

            if (price != 0) {
                System.out.println("you chose: " + choice);
                System.out.printf("cost: $%.2f\n", price);
            }

        } while (option != 'D');
        System.out.println("Thank you for choosing Jimmy Johns");
    }
}
