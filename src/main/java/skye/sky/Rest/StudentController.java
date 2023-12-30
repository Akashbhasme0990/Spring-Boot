package skye.sky.Rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import skye.sky.Entity.Student;
import skye.sky.dao.StudentDAO;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private final StudentDAO studentDAO;

    @Autowired
    public StudentController(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }

    @GetMapping
    public List<Student> getAllStudents() {
        return studentDAO.findAll();
    }
}
