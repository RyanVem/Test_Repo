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
 * This code checks if the value of y is equal to 8,
 * and if it is true it checks the value of x if it 
 * is equal to 5, it prints "@@@@@", 
 * if the y value is not 8 it prints "#####", "$$$$$" and "&&&&&".
 */
public class Q3c {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Declaring variables x and y and initializing them with values 5 and 7 respectively
        int x = 5, y = 7;
        
        // Does y is equal to 8
        if (y == 8) {
            // Does x is equal to 5
            if (x == 5) {
                // If x and y are true, print "@@@@@"
                System.out.println("@@@@@");
            }
        }
        // When x is not equal to 8
        else {
            // print "#####", "$$$$$", then "&&&&&"
            System.out.println("#####");
            System.out.println("$$$$$");
            System.out.println("&&&&&");
        }
    }
}