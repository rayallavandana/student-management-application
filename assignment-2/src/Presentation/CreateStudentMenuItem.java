package data;

import data.MenuItem;
import data.StudentDao;
import logic.Student;

import java.util.Scanner;

public class CreateStudentMenuItem extends MenuItem {
    private final StudentDao studentDao;
    private final Scanner scanner;

    public CreateStudentMenuItem(String menuItemName, StudentDao studentDao, Scanner scanner) {
        super(menuItemName);
        this.studentDao = studentDao;
        this.scanner = scanner;
    }

    @Override
    public void select() {
        Student newStudent = new Student();
        System.out.println("data.StudentDao.Student ID:");
        newStudent.setId(scanner.nextInt());
        scanner.nextLine();
        System.out.println("First name:");
        newStudent.setFirstName(scanner.nextLine());
        System.out.println("Last name:");
        newStudent.setLastName(scanner.nextLine());
        studentDao.add(newStudent);
    }
}

