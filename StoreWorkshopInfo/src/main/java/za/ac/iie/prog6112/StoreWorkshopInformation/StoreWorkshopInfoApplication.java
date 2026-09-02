/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.iie.prog6112.StoreWorkshopInformation;

/**
 *
 * @author Student
 */

// This is the main class where the program starts running.
public class StoreWorkshopInfoApplication {

    // The main method is the first method that runs in this program.
    public static void main(String[] args) {

        // Create the first WorkshopModel object to store Java workshop data.
        WorkshopModel javaModel = new WorkshopModel();

        // Assign values to the public variables inside the javaModel object.
        javaModel.WorkshopName = "Java Fundamentals";
        javaModel.Bookings = 28;

        // Create the second WorkshopModel object to store Web workshop data.
        WorkshopModel webModel = new WorkshopModel();

        // Assign values to the public variables inside the webModel object.
        webModel.WorkshopName = "Web Programming";
        webModel.Bookings = 16;

        // Create the third WorkshopModel object to store Database workshop data.
        WorkshopModel databaseModel = new WorkshopModel();

        // Assign values to the public variables inside the databaseModel object.
        databaseModel.WorkshopName = "Database Design";
        databaseModel.Bookings = 34;

        // Create workshop objects using the correct child classes.
        Workshop javaWorkshop = new LabWorkshop(javaModel);
        Workshop webWorkshop = new OnlineWorkshop(webModel);
        Workshop databaseWorkshop = new LabWorkshop(databaseModel);

        // Store all workshop objects in one array so they can be processed in a loop.
        Workshop[] workshops = {
            javaWorkshop,
            webWorkshop,
            databaseWorkshop
        };

        // Print the heading for the report.
        System.out.println("CODING WORKSHOP BOOKING SUMMARY");
        System.out.println("---------------------------------------------------");

        // This for loop goes through each workshop object in the workshops array.
        for (int i = 0; i < workshops.length; i++) {

            // Display the workshop name by calling the GetWorkshopName method.
            System.out.println("WORKSHOP: "
                    + workshops[i].GetWorkshopName());

            // Display the number of bookings by calling the GetBookings method.
            System.out.println("BOOKINGS: "
                    + workshops[i].GetBookings());

            // Display the mode by calling the version of GetWorkshopMode for that object.
            System.out.println("MODE: "
                    + workshops[i].GetWorkshopMode());

            System.out.println("---------------------------------------------------");
        }

        // Create an integer array with the same size as the workshops array.
        int[] bookingTotals = new int[workshops.length];

        // This loop copies each booking number into the bookingTotals array.
        for (int i = 0; i < bookingTotals.length; i++) {
            bookingTotals[i] = workshops[i].GetBookings();
        }

        // This outer loop controls how many sorting passes are done.
        for (int i = 0; i < bookingTotals.length - 1; i++) {

            // This inner loop compares two values next to each other.
            for (int j = 0; j < bookingTotals.length - 1 - i; j++) {

                // If the left value is bigger, the two values must swap places.
                if (bookingTotals[j] > bookingTotals[j + 1]) {

                    // A temporary variable is used so one value is not lost during the swap.
                    int temporary = bookingTotals[j];
                    bookingTotals[j] = bookingTotals[j + 1];
                    bookingTotals[j + 1] = temporary;
                }
            }
        }

        // Display the sorted booking totals on one line.
        System.out.print("SORTED BOOKING TOTALS: ");

        // This loop prints each value from the sorted bookingTotals array.
        for (int i = 0; i < bookingTotals.length; i++) {
            System.out.print(bookingTotals[i]);

            // This if statement adds a space after each number except the last one.
            if (i < bookingTotals.length - 1) {
                System.out.print(" ");
            }
        }

        // Move to the next line after printing all the sorted totals.
        System.out.println();
        System.out.println("---------------------------------------------------");
    }
}
