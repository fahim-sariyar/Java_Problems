# 🏠 Smart Home Automation System (Java OOP)

## 📖 Project Description

A Smart Home Automation System controls different types of devices using 
Multilevel Inheritance and Runtime Polymorphism in Java.

The system includes:

- Base Class: Device
- Intermediate Class: Appliance
- Derived Class: SmartAppliance
- Controller Class: HomeController

---

## 🏗️ Class Structure

Device  
   ↑  
Appliance  
   ↑  
SmartAppliance  

HomeController  

---

## 📌 Part A: Base Class – Device

### Attribute:
- int deviceId

### Constructor:
- Initializes deviceId

### Method:
- void operate()

Prints:

---

## 📌 Part B: Intermediate Class – Appliance

### Extends:
- Device

### Additional Attribute:
- double powerConsumption

### Constructor:
- Initializes deviceId and powerConsumption

### Overridden Method:
- void operate()

Prints:

---

## 📌 Part C: Derived Class – SmartAppliance

### Extends:
- Appliance

### Additional Attribute:
- boolean wifiEnabled

### Constructor:
- Initializes deviceId, powerConsumption, and wifiEnabled

### Overridden Method:
- void operate()

Function:
- Calls parent method using `super.operate()`
- Then prints:

---

## 📌 Part D: Runtime Polymorphism

### Class:
- HomeController

### Method:

Function:
- Accepts a Device reference
- Calls `operate()` on the received object

---

## 📌 Part E: Main Method

In the `main()` method:

- Create a SmartAppliance object
- Store it in a Device reference variable
- Pass the reference to `controlDevice()`

### Example:

---

## 🎯 OOP Concepts Used

- Multilevel Inheritance  
- Method Overriding  
- super Keyword  
- Runtime Polymorphism  
- Dynamic Method Dispatch  

---



## 🖥️ Expected Output
Operating appliance with power consumption: 1500.5W
Smart features enabled: true


