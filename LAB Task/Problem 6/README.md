# 🏫 University Course Management System (Java OOP)
## 📖 Project Description

A University Course Management System manages different types of courses and their evaluation methods using
Abstract Class, Interface, Multiple Inheritance, and Runtime Polymorphism in Java.

The system includes:

- Abstract Class: Course
- Interface: TheoryEvaluation
- Interface: LabEvaluation
- Derived Class: HybridCourse
- Service Class: CourseService

## 🏗️ Class Structure

Course (Abstract Class)
    ↑
HybridCourse
---
## TheoryEvaluation (Interface)
### LabEvaluation (Interface)

CourseService

Part A: Abstract Class – Course
Create an abstract class Course with:
Protected attributes:
courseCode (String)
credit (double)
Constructor to initialize the attributes.
An abstract method:
abstract double calculateFinalMarks();
A concrete method:
void displayCourseInfo()
that prints course code and credit.
Part B: Interface – TheoryEvaluation
Create an interface TheoryEvaluation with:
double theoryMarks(); 
Part C: Interface – LabEvaluation
Create another interface LabEvaluation with:
double labMarks();
Part D: Multiple Inheritance Using Interfaces
Create a class HybridCourse that:
extends Course
implements both TheoryEvaluation and LabEvaluation
In this class:
Implement all interface methods.
Override calculateFinalMarks() to return:
theoryMarks() + labMarks()
Part E: Runtime Polymorphism
Create a class CourseService with a method:
void printFinalResult(Course c)
This method should:
Accept a Course reference
Call calculateFinalMarks()
Display the final marks
Part F: Main Method
In the main() method:
Create an object of HybridCourse
Store it in a Course reference variable
Pass the reference to printFinalResult()..............
