package skye.sky.dao;

import org.springframework.stereotype.Repository;
import skye.sky.Entity.Employee;

import java.util.List;

@Repository
public interface EmployeeDAO  {
    List<Employee> findAll();

}
