/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.iie.prog6112.StoreWorkshopInformation;

/**
 *
 * @author Student
 */

// This interface lists the methods that every workshop class must have.
public interface IWorkshop {

    // This method must return the name of the workshop.
    String GetWorkshopName();

    // This method must return the number of bookings for the workshop.
    int GetBookings();
}
