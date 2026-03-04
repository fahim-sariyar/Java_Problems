### Instructions:

# Create a new word document named ID.docx (use your full ID).

Copy paste the entire code into the word document.

Add the output from the terminal by screenshot. For output, use the given sample input. 

Submit the docx file in the given link. 

While submitting First Name will be Last three digits of your roll and Last Name will be nickname/short name. For Example: First Name: 243, Last Name: Shakib.

Copied codes or use of AI will be penalized.


Solve the following questions:


A software company wants to develop a small payroll program that calculates salaries for different types of employees. The system must be designed using object-oriented programming.

In this program, create an abstract class named Employee that represents a general employee. The Employee class must contain two attributes: String name and double baseSalary. The class must have a constructor that initializes these two attributes. The Employee class must also declare an abstract method named calculateSalary() which will be implemented by subclasses to compute the final salary. In addition, the Employee class must contain a method named showDetails() that prints the employee’s name, the employee type, the base salary, and the final salary by calling the calculateSalary() method.

Create two subclasses named Manager and Developer, and both classes must extend the Employee class.

The Manager class must contain one additional attribute named double bonus. The constructor of this class must receive the values for name, baseSalary, and bonus and pass the common values to the Employee constructor using super. The Manager class must override the calculateSalary() method so that the final salary becomes baseSalary + bonus.

The Developer class must contain one additional attribute named int overtimeHours. The overtime rate is fixed at 500 per hour. The constructor of this class must receive the values for name, baseSalary, and overtimeHours and pass the common values to the Employee constructor using super. The Developer class must override the calculateSalary() method so that the final salary becomes baseSalary + (overtimeHours × 500). The number of overtime hours for the developer must be taken as input from the user.

In the main() method, create one Manager object and one Developer object. Store each object in an Employee reference variable, meaning the reference type is Employee but it accesses Manager and Developer objects. Call the showDetails() method using these Employee references. 


Sample Inputs:

Enter overtime hours for Developer: 6


Sample Outputs:


Name: Rahim

Type: Manager

Base Salary: 80000.0

Final Salary: 85000.0


Name: Karim

Type: Developer

Base Salary: 70000.0

Final Salary: 73000.0

