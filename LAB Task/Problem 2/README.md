# 💳 Payment Processing System (Java OOP )

## 📖 Project Description

A Payment Processing System supports different types of payments using 
Multilevel Inheritance and Runtime Polymorphism in Java.

The system includes:

- Base Class: Payment
- Derived Class: OnlinePayment
- Further Derived Class: MobileBankingPayment
- Service Class: PaymentService

---

## 🏗️ Class Structure

Payment  
   ↑  
OnlinePayment  
   ↑  
MobileBankingPayment  

PaymentService  

---

## 📌 Part A: Base Class – Payment

Attributes:
- double amount

Constructor:
- Initializes the amount.

Method:
- void processPayment()  
  Prints:  
  "Processing general payment of amount: <amount>"

---

## 📌 Part B: Derived Class – OnlinePayment

Extends:
- Payment

Additional Attribute:
- String platform

Constructor:
- Initializes both amount and platform.

Method (Override):
- void processPayment()  
  Prints:  
  "Processing online payment via <platform> of amount: <amount>"

---

## 📌 Part C: Further Derived Class – MobileBankingPayment

Extends:
- OnlinePayment

Additional Attribute:
- String mobileNumber

Constructor:
- Initializes amount, platform, and mobileNumber.

Method (Override):
- void processPayment()  
  Prints:  
  "Processing mobile banking payment from <mobileNumber> via <platform> of amount: <amount>"

---

## 📌 Part D: Runtime Polymorphism Demonstration

Class:
- PaymentService

Method:
- void executePayment(Payment p)

Function:
- Accepts a Payment reference
- Calls processPayment() on the received object

---

## 📌 Part E: Main Method

In the main() method:

- Create an object of MobileBankingPayment
- Store it in a Payment reference variable
- Pass the reference to executePayment()

Example:


---

## 🎯 OOP Concepts Used

- Multilevel Inheritance
- Method Overriding
- Runtime Polymorphism
- Dynamic Method Dispatch

---

## 🖥️ Expected Output

Processing mobile banking payment from 0151898XXX via bKash of amount: 5000.0
