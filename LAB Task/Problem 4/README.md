###  Employee Management System (Java OOP)
## 📖 Project Description
This project demonstrates Multilevel Inheritance and Runtime Polymorphism in Java.

An Employee Management System manages different levels of employees in an organization.

A SeniorManager is a type of Manager, and a Manager is a type of Employee.
---
🏗️ Class Structure
1️⃣ Employee Class (Base Class)
Attributes:

empId (int)

basicSalary (double)

Constructor:

Initializes empId and basicSalary

Method:

calculateSalary() → returns basicSalary

2️⃣ Manager Class (Intermediate Class)
Extends: Employee

Additional Attribute:

managementAllowance (double)

Constructor:

Initializes empId, basicSalary, and managementAllowance

Overridden Method:

calculateSalary() → returns basicSalary + managementAllowance

3️⃣ SeniorManager Class (Derived Class)
Extends: Manager

Additional Attribute:

performanceBonus (double)

Constructor:

Initializes empId, basicSalary, managementAllowance, and performanceBonus

Overridden Method:

calculateSalary() → returns
basicSalary + managementAllowance + performanceBonus

4️⃣ PayrollService Class
Method:

generatePayroll(Employee e)

This method:

Accepts an Employee reference

Calls calculateSalary()

Prints the total salary

5️⃣ Main Method
Create an object of SeniorManager

Store it in an Employee reference variable

Pass the reference to generatePayroll()

🔗 OOP Concepts Used
Multilevel Inheritance

Method Overriding

Runtime Polymorphism

Upcasting

Dynamic Method Dispatch
