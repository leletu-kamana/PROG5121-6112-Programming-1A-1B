/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package za.ac.iie.prog6112.trycatchdemo;

import java.util.Scanner;
/**
 *
 * @author Student
 */
public class TryCatchDemo {

    public static void main(String[] args) {
        
       Scanner input = new Scanner (System.in); // creates a scanner object for input
       
       //declaring the variables that are used in the activity
       int firstNumber = 0; // this creates a variable for the first number
       int secondNumber = 0; // this creates a variable for the second number
       int answer = 0; // this creates a variable for the division answer
       
       
       System.out.println("==== Division Answer Calculations ====");
       
       try {
           //Display the variables that will be entered by user
           System.out.print("Enter the first number: ");
           firstNumber = input.nextInt();
           System.out.print("Enter the second number: ");
           secondNumber = input.nextInt();
           //calculates the users variables in division calculations, firstNumber/secondNumber
           answer = firstNumber / secondNumber;
           //Displays the users variable calculations
           System.out.println("Answer: " + answer);
       } catch (Exception ex) {
           // catches the incorrect variable input the user entered 
           System.out.println("The calculation could not be completed because we cant divide by zero");
       }
    }
}
