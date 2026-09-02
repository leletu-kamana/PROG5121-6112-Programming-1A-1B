/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.student;

/**
 *
 * @author Lelethu Kamana
 */

// This is the parent class for the students
public class StudentDetails {
    
    // ------------------------------------------------------
    // These variables keep the student's basic information.
    // They are private so they cannot be changed directly
    // from another class.
    // ------------------------------------------------------
    private String studentNumber;
    private String studentName;

    // ------------------------------------------------------
    // This constructor sets the student number and name
    // when a new Student object is created.
    // ------------------------------------------------------
    public StudentDetails(String studentNumber, String studentName) {
        this.studentNumber = studentNumber;
        this.studentName = studentName;
    }

    // ------------------------------------------------------
    // This method gets the student number.
    // final means the child class cannot override this method.
    // ------------------------------------------------------
    public final String getStudentNumber() {
        return studentNumber;
    }

    // ------------------------------------------------------
    // This method gets the student name.
    // ------------------------------------------------------
    public String getStudentName() {
        return studentName;
    }

    // ------------------------------------------------------
    // This method displays the student's basic information.
    // ------------------------------------------------------
    public void displayDetails() {
        // Display the student number
        System.out.println("STUDENT NUMBER: " + getStudentNumber());

        // Display the student name
        System.out.println("STUDENT NAME: " + getStudentName());
    }
}
