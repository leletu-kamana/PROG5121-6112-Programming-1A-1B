/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.iie.prog6112.technologyrepairprocessingreport_model;
 

/**
 *
 * @author Lelethu Kamana
 */
public class StandardRepair extends Repair {

    // Sends the model to the Repair class constructor
    public StandardRepair(RepairModel model) {
        super(model);
    }
    
    // Standard repairs have a 5% service fee
    @Override 
    public double GetServiceFee() {
        return GetPrice() * 0.05; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
}
