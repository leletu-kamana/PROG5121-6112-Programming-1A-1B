                                                                                                                                                                                                                                                                                                                                        /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog6112.lu3.model;

import prog6112.lu3.interfaces.Payable;
/**
 * 
 * Employee is abstract class
 * An abstract class implements a general concept
 * We know that an employee should have an employee number and a name
 * However, we do not yet know exactly how every employees salary should be calculated
 * 
 * @author Student
 */
public abstract class Employee implements Payable {
    
    // protected means subclasses can access these variables dierctly
    protected String employeeNumber;
    protected String fullName;

    
    public Employee(String employeeNumber, String fullName) {
        
        // constructor for the employee class
        // subclasses will be use this constructor throughth supper() keyword
        this.employeeNumber = employeeNumber;
        this.fullName = fullName;
    }
    
    // getter method
    // it will enable the other classes to retrive the employees full name 
    public String getFullName() {
        return fullName;
    }

    // becouse employee implements Payable, calculatePay(); must exist
    // but employee is abstract, so we can leave the actual calculation to the subclasses
    @Override
    public abstract double calculatePay();

    // toString() comes from Javas Object class
    // we override it so that printing an employees gives useful info.
    // instead of something not usefull like Employee5nkhdvhdfdhd
    @Override
    public String toString() {
        return employeeNumber + " - " + fullName;
    }
}