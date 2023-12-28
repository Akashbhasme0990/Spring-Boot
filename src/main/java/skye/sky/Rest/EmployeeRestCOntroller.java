package skye.sky.Rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import skye.sky.Entity.Employee;
import skye.sky.dao.EmployeeDAO;

import java.util.List;

@RestController
@RequestMapping("/empApi")
public class EmployeeRestCOntroller {
    private EmployeeDAO employeeDAO;
    public EmployeeRestCOntroller(EmployeeDAO theEmployeeDAO){
        employeeDAO= theEmployeeDAO;
    }
    @GetMapping("/employees")
    public List<Employee> findAll(){
        return  employeeDAO.findAll();
    }
}
