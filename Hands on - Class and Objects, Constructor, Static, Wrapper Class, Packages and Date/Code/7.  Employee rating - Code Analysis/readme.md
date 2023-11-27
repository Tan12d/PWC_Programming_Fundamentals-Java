# Practice program: Employee rating - Code Analysis

## Description

Analyze the code for compile time errors. You are provided with the code skeleton having the full solution with compile time errors. Fix the compile time error in the code.

Dream Tek Company provides a rating to its employees based on the "certification" they have completed. For each certification completed by the employee, the rating will be increased by one. Based on the rating, the company planned to provide an increment for the employees. For the current year, the employees can take any of the certification courses. 

They are:

a.       JAVA

b.      ORACLE

c.       GCUX

d.      CCNA

e.      AWS

For each certification the rating will be 1. If an employee has completed three certifications, their rating will be 3. The employee is supposed to take up the certification suggested by the company. If the employee takes up some other certification, their rating will not be updated for that certification.

![image](https://github.com/Tan12d/PWC_Programming_Fundamentals-Java/assets/100254217/3ff928b9-a728-4064-9ad8-08456f13a821)

Help the Dream Tek Company to develop a java application to do the above task.

Consider the below class:

In the Employee class include the given attributes methods and constructor with the access specifiers as specified in the class diagram.

The constructors are used to initialize the value and the getter methods are used to retrieve the value.

The findRating() method should set the rating based on the certification completed by the employee.

The calculateIncrement() method should calculate the increment based on the rating and update the salary with the incremented amount. This method should return the increment amount. (For example: if the salary is 50000, and the incremented amount is 4000, then this method should return 4000, and update the salary as 54000).

In the UserInterface class, Get the details as shown in the sample input and create an object for the Employee class; invoke the appropriate methods to get the results as shown in the sample output.

Note:

You are given logic with a compilation error. Clear all the compilation errors and make it an error-free code.
 In the Sample Input / Output provided, the highlighted text in bold corresponds to the input given by the user and the rest of the text represents the output.
Ensure to follow the object-oriented specifications provided in the question description.
Ensure to provide the names for classes, attributes, and methods as specified in the question description.
Adhere to the code template, if provided.
Please do not use System.exit(0) to terminate the program.
 

 

Sample Input1:

Enter the employee id:

TEK163

Enter the salary:

50000

Enter the no of certification complete:

3

Enter the certification names:

JAVA

ORACLE

CCNA

Sample Output1:

Your rating is 3

Increment amount is 2500.00

Current salary 52500.00

 

Sample Input2:

Enter the employee id:

TEK163

Enter the salary:

50000

Enter the no of certification complete:

3

Enter the certification names:

JAVA

J2EE

CCNA

Sample Output2:

Your rating is 2

Increment amount is 1750.00

Current salary 51750.00

 

Sample Input3:

Enter the employee id:

TEK163

Enter the salary:

50000

Enter the no of certification complete:

3

Enter the certification names:

PHP

J2EE

MYSQL

Sample Output3:

Your rating is 0

Increment amount is 0.00

Current salary 50000.00

## Output

![image](https://github.com/Tan12d/PWC_Programming_Fundamentals-Java/assets/100254217/8c21c3d2-dba7-47a8-a63f-088bdabb2362)
