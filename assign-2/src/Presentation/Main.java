package Presentation;

import data.StudentDao;
import data.ArrayListStudentDao;
import logic.Student;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {s
    public static final String ADD_MENU_ITEM = "1";
    public static final String UPDATE_MENU_ITEM = "2";
    public static final String LIST_MENU_ITEM = "3";
    public static final String DELETE_MENU_ITEM = "4";
    public static final String EXIT_MENU_ITEM = "5";
    public static final String NO_MENU_ITEM = "0";

    public static void main(String[] args) {
        String choice = NO_MENU_ITEM;
        StudentDao studentDao = new ArrayListStudentDao();
        Scanner scanner = new Scanner(System.in);

        while (!choice.equals(EXIT_MENU_ITEM)) {
            System.out.println("Here are the available menu items:");
            System.out.println("1. Add student");
            System.out.println("2. Update student");
            System.out.println("3. Show list of students");
            System.out.println("4. Delete student");
            System.out.println("5. Exit");
            System.out.println("___________________________");

            System.out.printf("Please enter your choice:");
            choice = scanner.nextLine();
            System.out.println();

            switch (choice) {
                case ADD_MENU_ITEM:
                    Student newStudent = new Student();
                    System.out.printf("Student ID:");
                    newStudent.setId(scanner.nextInt());
                    scanner.nextLine();
                    System.out.printf("First name:");
                    newStudent.setFirstName(scanner.nextLine());
                    System.out.printf("Last name:");
                    newStudent.setLastName(scanner.nextLine());
                    studentDao.add(newStudent);
                    System.out.println("___________________________");
                    break;
                case UPDATE_MENU_ITEM:
                    System.out.printf("Enter the student ID to update:");
                    int idToUpdate = scanner.nextInt();
                    scanner.nextLine();
                    Student studentToUpdate = studentDao.getById(idToUpdate);
                    if (studentToUpdate != null) {
                        System.out.printf("Enter the new first name:");
                        studentToUpdate.setFirstName(scanner.nextLine());
                        System.out.printf("Enter the new last name:");
                        studentToUpdate.setLastName(scanner.nextLine());
                        studentDao.update(studentToUpdate);
                        System.out.println("___________________________");
                    } else {
                        System.out.println("Student not found with ID " + idToUpdate);
                        System.out.println("___________________________");
                    }
                    break;
                case LIST_MENU_ITEM:
                    System.out.println("___________________________");
                    System.out.printf("%-5s%-15s%-15s%n", "id", "firstName", "lastName");
                    System.out.println("___________________________");
                    for (Student student : studentDao.getAll()) {
                        System.out.println(student);
                        System.out.println();
                    }
                    break;
                case DELETE_MENU_ITEM:
                    System.out.printf("Enter the student ID to delete:");
                    int idToDelete = scanner.nextInt();
                    scanner.nextLine();
                    studentDao.delete(idToDelete);
                    System.out.println();
                    System.out.println("___________________________");
                    break;
            }
        }
    }
}




