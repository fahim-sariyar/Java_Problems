# 🏢 Company Resource Management System (Java OOP)

## 📖 Project Description

A Company Resource Management System keeps track of employees and the total number of staff members using a static class variable.
Part A: Base Class – Staff
Create a class Staff with:
Attributes:
staffId (int)
basicPay (double)
Static attribute:
totalStaff (int)
(This variable counts the total number of staff objects created.)
Constructor to initialize instance variables and increment totalStaff.
Method:
double calculatePay()
that returns basicPay.
Part B: Intermediate Class – Supervisor
Create a class Supervisor that extends Staff with:
Additional attribute:
supervisionAllowance (double)
Constructor to initialize all attributes.
Override calculatePay() to return:
basicPay + supervisionAllowance
Part C: Derived Class – Manager
Create a class Manager that extends Supervisor with:
Additional attribute:
managementBonus (double)
Constructor to initialize all attributes.
Override calculatePay() to return:
basicPay + supervisionAllowance + managementBonus
Part D: Runtime Polymorphism
Create a class PayrollSystem with a method:
void generatePaySlip(Staff s)
This method should:
Accept a Staff reference
Call calculatePay() and print the total pay
Part E: Main Method
In the main() method:
Create at least:
one Supervisor object
one Manager object
Store both objects in Staff reference variables.
Pass them to generatePaySlip().
Print the value of Staff.totalStaff.

---

## 🏗️ Output 
Total Pay: 50000.0
Total Pay: 85000.0
Total Staff Members: 2
