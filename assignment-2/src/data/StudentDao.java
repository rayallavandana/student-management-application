package data;

import java.util.List;
import logic.Student;

public interface StudentDao {
    void add(Student student);

    void update(Student student);

    void delete(int id);

    Student getById(int id);

    List<Student> getAll();
}