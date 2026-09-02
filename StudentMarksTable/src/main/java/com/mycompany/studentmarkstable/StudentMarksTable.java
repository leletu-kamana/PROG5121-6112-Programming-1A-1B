/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.studentmarkstable;

/**
 *
 * @author Student
 */
public class StudentMarksTable {

    public static void main(String[] args) {

        // 2D array: rows = students, columns = subjects
        int[][] marks = {
            {85, 90, 78},  // Student 1
            {70, 88, 92},  // Student 2
            {95, 80, 85}   // Student 3
        };

        // Display the array
        for (int student = 0; student < marks.length; student++) {
            System.out.print("Student " + (student + 1) + ": ");

            for (int column = 0; column < marks[student].length; column++) {
                System.out.print(marks[student][column] + " ");
            }

            System.out.println();
        }
    }
}

