//package skye.sky.Rest;
//
////import jakarta.annotation.PostConstruct;
////import org.springframework.web.bind.annotation.GetMapping;
////import org.springframework.web.bind.annotation.RequestMapping;
////import org.springframework.web.bind.annotation.RestController;
////import skye.sky.Entity.Student;
////import skye.sky.Entity.User;
////import skye.sky.dao.StudentDAO;
////
////import java.util.ArrayList;
////import java.util.List;
////
////@RestController
////@RequestMapping("/studentapi")
////public class studentRestController {
////    private StudentDAO studentDAO;
////    public  studentRestController(StudentDAO thestudentDAO){
////        studentDAO=thestudentDAO;
////    }
////    @GetMapping("/students")
////    public List<Student> getAll() {
////        return studentDAO.getAll();
////    }
////}
