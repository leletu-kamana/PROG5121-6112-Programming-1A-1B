/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog6112.lu3.model;

/**
 * FullTimeEmployee EXTENDS Employee
 * this means FullTimeEmployee inherits the common info found on Employee
 * 
 * @author Student
 */
public class FullTimeEmployee extends Employee {
    
    // this field only belongs to full time employees 
    private double monthlySalary;
    
    // Constructor

    public FullTimeEmployee(double monthlySalary, String employeeNumber, String fullName) {
        
        // super() calls the constructor of the Employee superclass
        //employee will store the employee number and full name
        super(employeeNumber, fullName);
        
        this.monthlySalary = monthlySalary;
    }
    
    // employee required us to provide calculatePay()
    // this is METHOD OVERRIDE
    @Override
    public double calculatePay() {
        
        // a full employee simply recieves the monthly salary
        return monthlySalary; 
    }
}
