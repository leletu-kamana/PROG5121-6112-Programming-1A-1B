/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog6112.lu3.model;

/**
 *
 * @author Student
 */
public class PartTimeEmployee extends Employee {
    
    // part tmie employee need info that full time employees do not need
    private double hourlyRate;
    private int hoursWorked;
    
    // constructor
    public PartTimeEmployee(double hourlyRate, int hoursWorked, String employeeNumber, String fullName) {
        
        // send common employee info to the superclass
        super(employeeNumber, fullName);
        
        // save the specialized info
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    
    // the FullTimeEmployees has itrs own version of the caculatePay()
    @Override 
    public double calculatePay() {
        
        // part time pay is hourly rate * the number of hours worked
        return hourlyRate * hoursWorked; 
    }
}
