package main.designpattern.dataAccessObjectPattern;

import java.util.List;

/**
 * @author bx
 * @date 9/16/2019 10:36 PM
 */
public interface StudentDao {
    List<Student> getAllStudents();

    Student getStudent(int rollNO);

    void updateStudent(Student student);

    void deleteStudent(Student student);
}
