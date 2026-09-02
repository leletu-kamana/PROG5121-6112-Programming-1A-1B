/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bubblesorting;

/**
 *
 * @author Student
 */
public class BubbleSorting {

    public static void main(String[] args) { 
        
        //Ascending bubble sorting
        int[] marks = {65,98,43,12,76,81,5};
        
        //Displays the array containing student marks 
        System.out.println("Before sorting: ");
        displayArray(marks); 
        
        //Sorts the array from smallest to largest
        bubbleSortAscending(marks);
        
        //Displays the array after sorting
        System.out.println("After sorting: ");
        displayArray(marks);
    }
    
    public static void bubbleSortAscending(int[] values) {
        
        //Controls the number of passes
        int pass;
        
        //Controls the crrent array position
        int index;
        
        //Temporarily stores a value during swapping
        int temp;
        
        //Repeats the sorting process for each pass
        for (pass = 0; pass < values.length - 1; pass++) {
            
            //Compares neighbouring values
            for (index = 0; index < values.length - 1 - pass; index++) {
                
                //Checks values whether are in the wrong position
                if (values[index] > values[index + 1]) {
                    
                    //saves the current value temporarily
                    temp = values[index];
                    
                    // moves the smaller values to the left
                    values[index] = values[index + 1];
                    
                    //places thesaved value on the right
                    values[index + 1] = temp;
                  
                }
            }
        }
    }
    
    public static void displayArray(int[] values) {
        
        //Visits and displays every value in the array 
        for (int value : values) {
            System.out.println(value + " ");
        }
        
        //move the cursor to the next line
        System.out.println();
    }
    
    
}
