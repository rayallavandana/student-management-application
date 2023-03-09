package data;

import logic.Student;

import java.util.List;

public interface StudentDao {
    void add(Student student);

    void update(Student student);

    void delete(int id);

    Student getById(int id);

    List<Student> getAll();
}