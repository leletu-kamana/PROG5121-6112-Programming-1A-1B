/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package za.ac.iie.prog6112.technologyrepairprocessingreport;

import za.ac.iie.prog6112.technologyrepairprocessingreport_model.PriorityRepair;
import za.ac.iie.prog6112.technologyrepairprocessingreport_model.Repair;
import za.ac.iie.prog6112.technologyrepairprocessingreport_model.RepairModel;
import za.ac.iie.prog6112.technologyrepairprocessingreport_model.StandardRepair;

/**
 *
 * @author Lelethu Kamana
 */
public class TechnologyRepairProcessingReportApplication {

    public static void main(String[] args) {
        
        // This 2D array stores the customers name, price and repair type
        String[][] repairData = {
            {"Lerato Mokoena", "1200", "STANDARD"},
            {"Siyabonga Dlamini", "950", "PRIORITY"},
            {"Ayanda Ndlova", "abc", "STANDARD"}
        };
        
        // This array will store the valid repair objects
        Repair[] repairs = new Repair[repairData.length];
        
        // Keeps track of how many valid repairs were added
        int validRepairCount = 0;
        
        // Displaying the programs heading
        System.out.println("TECHNOLOGY REPAIR PROCESSING REPORT");
        System.out.println("--------------------------------------------------");
        
        // Loop through each repair record
        for (int i =0; i < repairData.length; i++) {
            
            try {
                
                // Process the current repair record
                Repair repair = ProcessRepair(repairData[i]);
                
                // Store the valid repair in the array
                repairs[validRepairCount] = repair;
                validRepairCount++;
                
                // Display the customer name
                System.out.println("CUSTOMER: " + repair.GetCustomerName());
                
                // Display the repair type
                System.out.println("REPAIR TYPE: " + repairData[i][2]);
                
                // Display the VAT amount
                System.out.println("VAT: R" + repair.GetTotal());
                
                // Display the total repair cost
                // The correct service fee is selected at runtime
                System.out.println("TOTAL: R" + repair.GetTotal());
   
            } catch (NumberFormatException e) {
                
                // This happens when the price is not a number
                System.out.println("INVALID PRICE INPUT: " + repairData[i][1]);
                
            } catch (IllegalArgumentException e) {
                
                // Handles prices that are not allowed
                System.out.println("INVALID PRICE: " + e.getMessage());
                
            } finally {
                
                // This message is displayed after every attempt
                System.out.println("PROCESSING ATTEMPT COMPLETED");
                System.out.println("-----------------------------------------------");
            }
        }

        // Create an array for the totals of valid repairs
        double[] repairTotals = new double[validRepairCount];

        // Copy the totals from the Repair objects
        for (int i = 0; i < validRepairCount; i++) {
            repairTotals[i] = repairs[i].GetTotal();
        }

        // Bubble sort the totals from lowest to highest
        for (int i = 0; i < repairTotals.length - 1; i++) {

            for (int j = 0;
                    j < repairTotals.length - 1 - i;
                    j++) {

                // Check if the current value is bigger
                // than the value next to it
                if (repairTotals[j] > repairTotals[j + 1]) {

                    // Swap the two values
                    double temporary = repairTotals[j];
                    repairTotals[j] = repairTotals[j + 1];
                    repairTotals[j + 1] = temporary;
                }
            }
        }

        // Display the sorted repair totals
        System.out.print("SORTED REPAIR TOTALS: ");

        for (int i = 0; i < repairTotals.length; i++) {

            // Check that the total is not negative
            assert repairTotals[i] >= 0
                    : "Repair total cannot be negative.";

            // Display the total with two decimal places
            System.out.printf("%.2f", repairTotals[i]);

            // Add a space between the totals
            if (i < repairTotals.length - 1) {
                System.out.print(" ");
            }
        }

        System.out.println();
        System.out.println("---------------------------------------------------");
    }

    // This method processes one repair record
    public static Repair ProcessRepair(String[] repairData)
            throws NumberFormatException, IllegalArgumentException {

        // Convert the price from a String to a double
        double price = Double.parseDouble(repairData[1]);

        // Check if the price is valid
        ValidatePrice(price);

        // Create a new RepairModel object
        RepairModel model = new RepairModel();

        // Add the customer name to the model
        model.CustomerName = repairData[0];

        // Add the price to the model
        model.Price = price;

        // Check which type of repair is needed
        if (repairData[2].equalsIgnoreCase("STANDARD")) {

            // Create a standard repair
            return new StandardRepair(model);

        } else if (repairData[2].equalsIgnoreCase("PRIORITY")) {

            // Create a priority repair
            return new PriorityRepair(model);

        } else {

            // Throw an error if the repair type is unknown
            throw new IllegalArgumentException(
                    "Unknown repair type: " + repairData[2]);
        }
    }

    // This method checks if the repair price is valid
    public static void ValidatePrice(double price)
            throws IllegalArgumentException {

        // A price of zero or less is not allowed
        if (price <= 0) {

            // Send the error back to the calling method
            throw new IllegalArgumentException(
                    "Repair price must be greater than zero.");
        }
    }
}
