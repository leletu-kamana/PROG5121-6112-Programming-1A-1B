/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.computerlabsbookingreport;

 /**
 * This program produces a statistical booking report for three computer labs
 * over four weeks. It displays the raw data, then calculates totals,
 * averages, minimums, and maximums per lab column.
 * 
 * @author Lelethu Kamana
 */
public class ComputerLabsBookingReport {

    public static void main(String[] args) {
        
        // -------------------- DATA INITIALISATION --------------------
        // Declare and fill a one‑dimensional array with the names of the labs.
        // These names will serve as column headers in our printed report.
        String[] laboratories = {
            "Programming",
            "Networking",
            "Multimedia"        
        };
        
        // Declare and fill a two‑dimensional array (4 rows × 3 columns).
        // Each row represents a week (1–4), each column a specific lab.
        // The numbers are the booking counts for that week and lab.
        int[][] bookings = {
            {32, 18, 24},
            {28, 25, 19},
            {35, 20, 27},
            {30, 22, 21}
        };
        
        // -------------------- PRINT HEADER --------------------
        System.out.println("COMPUTER LAB BOOKING REPORT");
        System.out.println();
        System.out.println("----------------------------------------");
       
        // Print the first column label "Weeks |" followed by all lab names.
        // The loop runs once for each lab; 'laboratories.length' equals 3.
        System.out.print("Weeks |");
        for (int labs = 0; labs < laboratories.length; labs++) {
            System.out.print(laboratories[labs] + " ");
        }
        System.out.println();  // move cursor to the next line after headings
        
        // -------------------- PRINT RAW DATA (WEEK BY WEEK) --------------------
        // Outer loop: iterate over each week (each row of the 2D array).
        // 'bookings.length' gives the number of rows = 4.
        for (int weeks = 0; weeks < bookings.length; weeks++) {
            // Print the week number (weeks+1 because index starts at 0).
            System.out.print("Week " + (weeks + 1) + "|     ");
            // Inner loop: iterate over each lab column for the current week.
            // 'bookings[weeks].length' gives the number of columns = 3.
            for (int lab = 0; lab < bookings[weeks].length; lab++) {
                // Print the booking value, followed by spaces for column alignment.
                System.out.print(bookings[weeks][lab] + "         ");
            }
            System.out.println();  // finish this week's row
        }

        System.out.println("----------------------------------------");
        
        // -------------------- TOTALS PER LAB --------------------
        /* Outer loop selects a lab column (0, 1, 2).
         * For each lab, we initialise a 'total' variable to 0.
         * Then an inner loop adds all bookings from that column across all weeks.
         * Finally we print the accumulated total under that lab's column.
         */
        System.out.print("Totals     ");
        for (int lab = 0; lab < laboratories.length; lab++) {
            int total = 0;  // reset sum for each new lab
            for (int weeks = 0; weeks < bookings.length; weeks++)  {
                // 'bookings[weeks][lab]' – row = week, column = lab.
                total += bookings[weeks][lab];
            }
            System.out.print(total + "         ");
        }
        System.out.println();
        
        // -------------------- AVERAGES PER LAB --------------------
        /* We reuse the same column‑wise summation logic.
         * Then we cast the integer 'total' to 'double' before division.
         * This ensures a decimal result (e.g., 27.5) instead of integer truncation.
         * The divisor is 'bookings.length' (number of weeks = 4).
         */
        System.out.print("Averages   ");
        for (int lab = 0; lab < laboratories.length; lab++) {
            int total = 0;
            for (int weeks = 0; weeks < bookings.length; weeks++) {
                total += bookings[weeks][lab];
            }
            double averages = (double) total / bookings.length;
            System.out.print(averages + "      ");
        }
        System.out.println();
        
        // -------------------- MINIMUM PER LAB --------------------
        /* For each lab column, we set 'minimum' to the first week's value.
         * Then we compare with all subsequent weeks (starting from index 1).
         * Whenever a smaller number is found, we update 'minimum'.
         * After the loop, we print the smallest value for that lab.
         */
        System.out.print("Minimum     "); 
        for (int lab = 0; lab < laboratories.length; lab++) {
            int minimum = bookings[0][lab];  // assume week 1 is the smallest
            for (int weeks = 1; weeks < bookings.length; weeks++) {
                // If this week's booking is less than current minimum, replace it.
                if (bookings[weeks][lab] < minimum) {
                    minimum = bookings[weeks][lab];
                }
            }
             System.out.print(minimum + "         ");
        }
        System.out.println();
        
        // -------------------- MAXIMUM PER LAB --------------------
        /* Similar to the minimum logic, but now we initialise with the first week
         * and update only when a larger booking count is discovered.
         * The condition uses '>' instead of '<'.
         */
        System.out.print("Maximum     "); 
        for (int lab = 0; lab < laboratories.length; lab++) {
            int maximum = bookings[0][lab];  // assume week 1 is the largest
            for (int weeks = 1; weeks < bookings.length; weeks++) {
                // If this week's booking exceeds current maximum, update it.
                if (bookings[weeks][lab] > maximum) {
                    maximum = bookings[weeks][lab];
                }
            }
             System.out.print(maximum + "         ");
        }
        // Program ends here – no return value needed for 'void' main.
    }
}