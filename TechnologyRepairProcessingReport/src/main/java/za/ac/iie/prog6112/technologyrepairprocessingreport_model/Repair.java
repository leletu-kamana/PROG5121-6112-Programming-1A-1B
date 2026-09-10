/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.iie.prog6112.technologyrepairprocessingreport_model;

import za.ac.iie.prog6112.technologyrepairprocessingreport_interface.IRepairCalculations;

/**
 *
 * @author Lelethu Kamana
 */
public abstract class Repair implements IRepairCalculations {
    
    // These fields are private to keep the data hidden
    private String customerName;
    private double price;
    
    // Constructor gets the information from the RepairModel
    public Repair(RepairModel model) {
        customerName = model.CustomerName;
        price = model.Price;
    }
    
    // Returns the customer name
    @Override
    public String GetCustomerName() {
        return customerName;
    }
    
    // Calculates VAT using 15% of the repair price
    @Override
    public double GetVat() {
        return price * 0.15;
    }
    
    // Allows the sub classes to get the repair price
    protected double GetPrice() {
        return price;
    }
    
    // Each repair will have its own service fee
    public abstract double GetServiceFee();
    
    // Adds the price, VAT and service fee together
    @Override
    public double GetTotal() {
        return price + GetVat() + GetServiceFee();
    }
}
