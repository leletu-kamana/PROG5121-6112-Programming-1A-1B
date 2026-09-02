/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.iie.prog6112.StoreWorkshopInformation;

/**
 *
 * @author Student
 */

// This class represents a workshop that takes place in a computer lab.
// The extends keyword means LabWorkshop inherits from the Workshop class.
public class LabWorkshop extends Workshop {

    // This constructor receives the workshop data and sends it to the parent class.
    public LabWorkshop(WorkshopModel model) {
        super(model);
    }

    // This method overrides the abstract method from the Workshop class.
    @Override
    public String GetWorkshopMode() {

        // This lab workshop returns LAB as its workshop mode.
        return "LAB";
    }
}
