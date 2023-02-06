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
 * This code iterates through integers up until 10000 
 * and prints out all the prime numbers to the console.
 */
public class Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // maximum number to check for prime numbers
        int maximum = 10000;
        int i = 2;
        // The outer loop continues as long as the current number (i) is less than the maximum number (10000)
        while(i < maximum) {
            // Assume that the current number (i) is prime
            boolean isPrime = true;
            // Initialize the inner loop variable j to 2
            int j = 2;
            // Check if the current number (i) is divisible by any number from 2 to (i-1)
            while (j < i) {
                // If the number is divisible by any number, it is not prime
                if (i % j == 0) {
                    isPrime = false;
                    // break the loop
                    break;
                }
                j++;
            }
            // print the prime number
            if (isPrime) {
                System.out.println(i);
            }
            i++;
           
        }
    }
    
}
