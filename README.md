# Student-Management-Application
## Teaching Block-1
**Project in Module-4**

It is a java Program Java Console program that accepts one argument via the args parameter
and prints that argument. If more arguments were given, only the first argument should be printed. If no argument is given, 
then it should print "No argument given." 

## Teaching Block-2

**INTRODUCTION:**

This repository contains a Java-based application that allows users to manage student data by performing CRUD operations. The application allows users to add, display, update, and delete student records.

**USAGE**

The application uses a console interface to interact with the user. Once the application is running, the user will be presented with a menu of options to choose from. To select an option, the user should enter the corresponding number and press enter. The application will then execute the selected operation and prompt the user for any necessary input.

**The available operations are:**

**Add Student:** Allows the user to add a new student record to the system.  
**Display All Students:** Displays a list of all the students currently stored in the system.

**Update Student:** Allows the user to update an existing student record in the system.

**Delete Student:** Allows the user to delete a student record from the system.

## Teaching Block-3
In this Teaching BLock we continued implementing  another feature called Sort and show and with exceptions.  
**Sorting and Displaying Students based on user input:**  
Here are the available menu items:
   1. Add student
   2. Update student
   3. Show list of students
   4. Delete student
   5. Sort and Show 
   6. Exit   
   To sort and display all students based on user input, select option 5 from the menu. 
   The program will ask you to enter how you want to sort the students:
   --by ID, 
   --By first name or
   --By last name
   Once you enter your choice, the program will sort the students accordingly and display them.  
**Exceptions**  
I used two exceptions, namely StudentAlreadyExists and NoSuchStudent. 
   The StudentAlreadyExists exception will be thrown when we try to add a student with an ID that already exists in the list.
   The NoSuchStudent exception will be thrown when we try to delete or update a student with an ID that is not present in the list.  
**CONCLUSION:**  
The Student Management Application is a simple yet effective way to manage student records. It allows users to perform basic CRUD operations and provides a straightforward interface for interaction.
