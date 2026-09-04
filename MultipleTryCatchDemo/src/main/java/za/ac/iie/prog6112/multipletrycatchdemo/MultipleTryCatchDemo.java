/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package za.ac.iie.prog6112.multipletrycatchdemo;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Student
 */
public class MultipleTryCatchDemo {

    public static void main(String[] args) {

        // Creates a Scanner object to allow the user to enter input
        Scanner input = new Scanner(System.in);

        try {
            // Asks the user to enter the total number of marks
            System.out.print("Enter a mark total: ");
            int total = input.nextInt();

            // Asks the user to enter the number of tasks
            System.out.print("Enter number of tasks: ");
            int tasks = input.nextInt();

            // Calculates the average by dividing the total by the number of tasks
            int average = total / tasks;

            // Displays the calculated average mark
            System.out.print("Average mark: " + average);

        } catch (InputMismatchException ex) {
            // Handles the error if the user enters something other than a whole number
            System.out.println("Invalid input, please enter a whole number.");

        } catch (ArithmeticException ex) {
            // Handles the error if the user enters zero for the number of tasks
            // Division by zero is not allowed in Java
            System.out.println("Invalid input, number of tasks cannot be zero.");
        }
    }
}
