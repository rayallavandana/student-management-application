package data;

import data.StudentDao;
import logic.Student;

import java.util.ArrayList;
import java.util.List;

public class ArrayListStudentDao implements StudentDao {
    private List<Student> students = new ArrayList<>();

    @Override
    public void add(Student student) {
        students.add(student);
    }

    @Override
    public void update(Student student) {
        Student s = getById(student.getId());
        if (s != null) {
            s.setFirstName(student.getFirstName());
            s.setLastName(student.getLastName());
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
        return null;
    }

    @Override
    public List<Student> getAll() {
        return students;
    }
}
