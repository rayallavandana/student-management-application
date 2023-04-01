package data;

import logic.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class ArrayListStudentDao implements data.StudentDao {
    private final List<Student> students = new ArrayList<>();

    @Override
    public void add(Student student) throws Exception {
        for (Student s : students) {
            if (s.getId() == student.getId()) {
                throw new Exception("Student with ID " + student.getId() + " already exists.");
            }
        }
        students.add(student);
    }

    @Override
    public void update(Student student) {
        Student s = getById(student.getId());
        if (s != null) {
            s.setFirstName(student.getFirstName());
            s.setLastName(student.getLastName());
        }
        else{
            throw new NoSuchStudentException(student.getId());
        }
    }

    @Override
    public void delete(int id) {
        Student s = getById(id);
        if (s != null) {
            students.remove(s);
        } else {
            throw new NoSuchStudentException(id);
        }
    }

    @Override
    public Student getById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        throw new NoSuchStudentException(id);
    }


    @Override
    public List<Student> getAllStudents() {
        return new ArrayList<>(students);
    }

    public List<Student> getAllSortedById() {
        List<Student> students = getAllStudents();
        students.sort(Comparator.comparing(Student::getId));
        return students;
    }

    public List<Student> getAllSortedByFirstName() {
        List<Student> students = getAllStudents();
        students.sort(Comparator.comparing(Student::getFirstName));
        return students;
    }

    public List<Student> getAllSortedByLastName() {
        List<Student> students = getAllStudents();
        students.sort(Comparator.comparing(Student::getLastName));
        return students;
    }

}
