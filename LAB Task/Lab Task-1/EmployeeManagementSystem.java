/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student
 */

import java.util.Scanner;

// Abstract class
abstract class Employee {
    String name;
    double baseSalary;

    public Employee(String name, double baseSalary) 
    {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    abstract double calculateSalary();
    public void showDetails() 
    {
        System.out.println("Name: " + name);
        System.out.println("Type: " + this.getClass().getSimpleName());
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Final Salary: " + calculateSalary());
        System.out.println();
    }
}

// 1st class
class Manager extends Employee {
    double bonus;

    public Manager(String name, double baseSalary, double bonus) 
    {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    double calculateSalary() 
    {
        return baseSalary + bonus;
    }
}

// 2nd class

class Developer extends Employee {
    int overtimeHours;
    final int overtimeRate = 500;

    public Developer(String name, double baseSalary, int overtimeHours) {
        super(name, baseSalary);
        this.overtimeHours = overtimeHours;
    }

    @Override
    double calculateSalary() 
    {
        return baseSalary + (overtimeHours * overtimeRate);
    }
}

// Main class

public class Main {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        Employee manager = new Manager("Rahim", 80000.0, 5000.0);

        System.out.print("Enter overtime hours for Developer: ");
        int hours = sc.nextInt();

        Employee developer = new Developer("Karim", 70000.0, hours);

        System.out.println();
        manager.showDetails();
        developer.showDetails();

      
    }
}
