/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog6112.lu3.app;

import prog6112.lu3.interfaces.Payable;
import java.util.Scanner;
import prog6112.lu3.model.Employee;
import prog6112.lu3.model.FullTimeEmployee;
import prog6112.lu3.model.PartTimeEmployee;
/**
 *
 * @author Student
 */
public class PayRoll_Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Part 1: Creating subclass objects
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(18500.00, "EMP001", "Thabo Mokoena");
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee(120.00, 80, "EMP002", "Aisha Naidoo");
        
        System.out.println("PAYROLL SYSTEM");
        System.out.println("------------------------------");
        System.out.println("Full-time employee: " + fullTimeEmployee);
        System.out.println("Monthly pay: R" + fullTimeEmployee.calculatePay());
        System.out.println();
        System.out.println("Part-time employee: " + partTimeEmployee);
        System.out.println("Monthly pay: R" + partTimeEmployee.calculatePay());
        System.out.println();
        
        // Part 2: Polymorphism using the Employee superclass
        Employee[] employees = new Employee[2];
        employees[0] = fullTimeEmployee;
        employees[1] = partTimeEmployee;
        
        System.out.println("PAYROLL LIST USING POLYMORPHISM");
        System.out.println("------------------------------");
        
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
            System.out.println("Pay: R" + employees[i].calculatePay());
            System.out.println();
        }
        
        // Part 3: Polymorphism using the Payable interface
        Payable payableEmployee = fullTimeEmployee;
        
        System.out.println("PAYABLE INTERFACE EXAMPLE");
        System.out.println("------------------------------");
        System.out.println("Pay calculated through Payable: R" + payableEmployee.calculatePay());
        System.out.println();
        
        // Part 4: Basic keyboard input
        System.out.println("ENTER A NEW PART-TIME EMPLOYEE");
        System.out.println("------------------------------");
        
        System.out.print("Enter employee number: ");
        String employeeNumber = input.nextLine();
        
        System.out.print("Enter full name: ");
        String fullName = input.nextLine();
        
        System.out.print("Enter hourly rate: R");
        double hourlyRate = input.nextDouble();
        
        System.out.print("Enter hours worked: ");
        int hoursWorked = input.nextInt();
        
        PartTimeEmployee newPartTimeEmployee = new PartTimeEmployee(hourlyRate, hoursWorked, employeeNumber, fullName);
        
        System.out.println();
        System.out.println("NEW EMPLOYEE PAYSLIP");
        System.out.println("------------------------------");
        System.out.println(newPartTimeEmployee);
        System.out.println("Pay: R" + newPartTimeEmployee.calculatePay());
        
        input.close();
    }
}
