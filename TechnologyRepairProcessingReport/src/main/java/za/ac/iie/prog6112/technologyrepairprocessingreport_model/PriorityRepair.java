/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.iie.prog6112.technologyrepairprocessingreport_model;

/**
 *
 * @author Lelethu Kamana
 */
public class PriorityRepair extends Repair {
    
    // Sends the model to the repair class constructor
    public PriorityRepair(RepairModel model) {
        super(model);
    }
    
    // Priority repairs have a 12% service fee
    @Override
    public double GetServiceFee() {
        return GetPrice() * 0.12;
    }
}
