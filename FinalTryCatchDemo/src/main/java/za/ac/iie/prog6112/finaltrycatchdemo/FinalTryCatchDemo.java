/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package za.ac.iie.prog6112.finaltrycatchdemo;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class FinalTryCatchDemo {

    public static void main(String[] args) {

        // Creates a Scanner object to receive input from the keyboard
        Scanner input = new Scanner(System.in);

        // Tracks whether the process has started or not
        // Initially set to false because the process has not started
        boolean processStarted = false;

        System.out.print("==== Division Average Calculation ====");
        
        try {
            // Indicates that the process has started
            processStarted = true;

            // Asks the user to enter the total number of marks
            System.out.print("Enter total marks: ");
            int total = input.nextInt();

            // Asks the user to enter the number of marks/tasks
            System.out.print("Enter number of marks: ");
            int tasks = input.nextInt();

            // Calculates the average by dividing the total by the number of tasks
            // This can cause an ArithmeticException if tasks is 0
            int average = total / tasks;

            // Displays the calculated average
            System.out.print("Average: " + average);

        } catch (Exception ex) {
            // Runs if an error occurs inside the try block
            // For example, entering text instead of a number
            // or dividing by zero
            System.out.println("The mark calculation failed");

        } finally {
            // The finally block always runs, whether an error occurred or not
            // Displays whether the process was started
            System.out.print("Cleanup completed: " + processStarted);
        }
    }
}
