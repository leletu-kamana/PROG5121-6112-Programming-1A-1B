/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.insertionsort;

/**
 *
 * @author Student
 */
public class InsertionSort {

    public static void main(String[] args) {

        int[] marks = {75, 62, 89, 55, 91, 68};

        System.out.println("Original Marks:");
        displayArray(marks);

        insertionSort(marks);

        System.out.println("Sorted Marks:");
        displayArray(marks);
    }
    
    public static void insertionSort(int[] marks) {

        for (int i = 1; i < marks.length; i++) {
            int key = marks[i];
            int j = i - 1;

            while (j >= 0 && marks[j] > key) {
                marks[j + 1] = marks[j];
                j--;
            }

            marks[j + 1] = key;
        }
    }

    public static void displayArray(int[] marks) {
        for (int mark : marks) {
            System.out.print(mark + " ");
        }
        System.out.println();
    }
}
