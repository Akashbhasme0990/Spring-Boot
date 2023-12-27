package skye.sky.dao;

import skye.sky.Entity.Student;

import java.util.List;

public interface StudentDAO {
    void save(Student theStudent);
    Student getElementByid(Integer id);
    List<Student> findAll();
    List<Student> findByLastName(String lastname);
    void updateStudent(Student theStudent);
    void delete(Integer id);
    int deleteAll();
}
