/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.student;

/**
 *
 * @author Lelethu Kamana
 */

// This class is a type of Student
public class ProgrammingStudent extends StudentDetails {
    
    // ------------------------------------------------------
    // This array stores all the practical marks.
    // ------------------------------------------------------
    private int[] practicalMarks;

    // ------------------------------------------------------
    // This constructor sets up the ProgrammingStudent.
    // It gets the student details and practical marks.
    // ------------------------------------------------------
    public ProgrammingStudent(String studentNumber, String studentName, int[] practicalMarks) {
        
        // Send the student number and name to the Student
        // class constructor.
        super(studentNumber, studentName);

        // Store the practical marks in the array.
        this.practicalMarks = practicalMarks;
    }

    // ======================================================
    // BUBBLE SORT
    // This method sorts the marks from lowest to highest.
    // ======================================================
    public void sortMarksAscending() {
        // This loop controls how many times we check the
        // marks.
        for (int i = 0; i < practicalMarks.length - 1; i++) {
            // This loop compares marks next to each other.
            for (int j = 0; j < practicalMarks.length - 1 - i;j++) {
                // Check if the mark on the left is bigger
                // than the mark on the right.
                if (practicalMarks[j] > practicalMarks[j + 1]) {
                    // Keep the first mark safe for a moment.
                    int temp = practicalMarks[j];

                    // Move the smaller mark to the left.
                    practicalMarks[j] = practicalMarks[j + 1];

                    // Put the saved mark on the right.
                    practicalMarks[j + 1] = temp;
                }
            }
        }
    }

    // ======================================================
    // CALCULATE AVERAGE
    // This method works out the average of the marks.
    // ======================================================
    public double calculateAverage() {
        
        // Start the total at zero.
        int total = 0;

        // Go through each mark in the array.
        for (int mark : practicalMarks) {
            // Add the mark to the total.
            total = total + mark;
        }

        // Divide the total by the number of marks.
        // double allows the answer to have decimal places.
        return (double) total / practicalMarks.length;
    }

    // ======================================================
    // DISPLAY DETAILS
    // This replaces the displayDetails() method from
    // the Student class.
    // ======================================================
    @Override
    public void displayDetails() {
        
        // First show the details from the Student class.
        super.displayDetails();

        // Sort the marks before displaying them.
        sortMarksAscending();

        // Print the sorted marks heading.
        System.out.print("SORTED PRACTICAL MARKS: ");

        // Go through the sorted array.
        for (int mark : practicalMarks) {
            // Print each mark on the same line.
            System.out.print(mark + " ");
        }

        // Move to the next line.
        System.out.println();

        // Display the average practical mark.
        System.out.println("AVERAGE PRACTICAL MARK: " + calculateAverage());
    }
}