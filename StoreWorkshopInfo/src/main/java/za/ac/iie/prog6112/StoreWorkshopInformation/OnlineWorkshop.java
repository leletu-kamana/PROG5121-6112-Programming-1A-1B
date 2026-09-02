/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.iie.prog6112.StoreWorkshopInformation;

/**
 *
 * @author Student
 */

// This class represents a workshop that is presented online.
// The extends keyword means OnlineWorkshop inherits from the Workshop class.
public class OnlineWorkshop extends Workshop {

    // This constructor receives the workshop data and sends it to the parent class.
    public OnlineWorkshop(WorkshopModel model) {
        super(model);
    }

    // This method overrides the abstract method from the Workshop class.
    @Override
    public String GetWorkshopMode() {

        // This online workshop returns ONLINE as its workshop mode.
        return "ONLINE";
    }
}
