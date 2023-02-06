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
public class Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // maximum number to check for prime numbers
        int maximum = 10000;
        // outer loop starts at 2 to check for primes
        for (int i = 2; i < maximum; i++) {
            // boolean variable to keep track of prime numbers
            boolean isPrime = true;
            // inner loop starts at 2 to check if i is divisible by any number
            for (int j = 2; j < i; j++) {
                // switch case to check if i is divisible by j
                switch (i % j) {
                    case 0:
                        isPrime = false;
                        break;
                    default:
                        break;
                }
                // if i is divisible, break the loop and move to next number
                if (!isPrime) break;
            }
            // print the prime number
            if (isPrime) {
                System.out.println(i);
            }
        }
    }
}
