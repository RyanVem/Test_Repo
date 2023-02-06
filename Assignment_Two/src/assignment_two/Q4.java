/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment_two;

/**
 *
 * @author ryanv
 * 
 * Date: 01-16-2023
 * 
 * This program prompts the user to enter numbers, sums them up 
 * and when the user enters zero it prints the sum of the entered 
 * numbers and exits the program.
 */

import java.util.Scanner;

public class Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        // variable to store the sum of numbers entered by user
        int sum = 0;

        // infinite loop to repeatedly ask for user input
        while (true) {
            // prompt the user for a number
            System.out.print("Enter a Number to ADD (Use Number Zero to Exit): ");
            // read the user input as an integer
            int num = scanner.nextInt();

            // check if the user input is zero
            if (num == 0) {
                // if so, break out of the loop
                break;
            }

            // otherwise, add the number to the sum
            sum += num;
        }

        // print out the final sum of the numbers entered by user
        System.out.println("The Sum of the Numbers Entered: " + sum);
    }
}
