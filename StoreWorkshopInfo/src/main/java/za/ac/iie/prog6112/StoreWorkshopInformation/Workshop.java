/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.iie.prog6112.StoreWorkshopInformation;

/**
 *
 * @author Student
 */

// This abstract class is the parent class for all workshop types.
// It also implements the IWorkshop interface methods.
public abstract class Workshop implements IWorkshop {

    // These private fields store the data for one workshop object.
    private String workshopName;
    private int bookings;

    // This constructor receives a WorkshopModel object and copies its values.
    public Workshop(WorkshopModel model) {
        workshopName = model.WorkshopName;
        bookings = model.Bookings;
    }

    // This method returns the workshop name stored in the private field.
    @Override
    public String GetWorkshopName() {
        return workshopName;
    }

    // This method returns the number of bookings stored in the private field.
    @Override
    public int GetBookings() {
        return bookings;
    }

    // This abstract method forces each child class to give its own mode.
    public abstract String GetWorkshopMode();
}
