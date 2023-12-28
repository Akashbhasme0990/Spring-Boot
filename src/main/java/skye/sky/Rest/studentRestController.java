package skye.sky.Rest;

import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import skye.sky.Entity.Student;
import skye.sky.Entity.User;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/studentapi")
public class studentRestController {
    private List<Student> theStudents;
    @PostConstruct
    public  void  loadData(){
        theStudents = new ArrayList<>();
        theStudents.add(new Student("akash1","bhasme11","akashbhasme011@gmail.com"));
        theStudents.add(new Student("akash1","bhasme11","akashbhasme011@gmail.com"));
        theStudents.add(new Student("akash1","bhasme11","akashbhasme011@gmail.com"));
        // Add more studdents if needed
    }
    @GetMapping("/Students")
    public List<Student> getStudents() {


        return theStudents;
    }
}
