/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.student;

/**
 *
 * @author Lelethu Kamana
 */

// This is the main class.
// The program starts running from here.
public class Student {
 
    // ------------------------------------------------------
    // MAIN METHOD
    // This is where Java starts the program.
    // ------------------------------------------------------
    public static void main(String[] args) {
        
        // --------------------------------------------------
        // PRACTICAL MARKS
        // Make an array to store the four practical marks.
        // --------------------------------------------------
        int[] marks = {68, 45, 82, 71};

        // --------------------------------------------------
        // CREATE STUDENT
        // Create a ProgrammingStudent object.
        //
        // The values being sent are:
        // Student number
        // Student name
        // Practical marks
        // --------------------------------------------------
        ProgrammingStudent student = new ProgrammingStudent(
                "ST10543210",
                "AYANDA MTHEMBU",
                marks);

        // --------------------------------------------------
        // REPORT HEADING
        // Print the heading for the student report.
        // --------------------------------------------------
        System.out.println("------------------------------------------");
        System.out.println("PROGRAMMING STUDENT PROGRESS REPORT");
        System.out.println("------------------------------------------");

        // --------------------------------------------------
        // DISPLAY DETAILS
        // Call the displayDetails() method.
        // The ProgrammingStudent version will run here.
        // --------------------------------------------------
        student.displayDetails();

        // Print a line after the report.
        System.out.println("------------------------------------------");
    }
}
