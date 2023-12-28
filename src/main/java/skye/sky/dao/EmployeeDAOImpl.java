package skye.sky.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import skye.sky.Entity.Employee;

import javax.swing.event.ListDataEvent;
import java.util.List;
@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
    private EntityManager entityManager2;
    @Autowired
    public EmployeeDAOImpl(EntityManager theEntityManager){
        entityManager2= theEntityManager;
    }

    @GetMapping("/employees")
    public List<Employee> findAll() {
        TypedQuery<Employee> theQuery= entityManager2.createQuery("from Employee", Employee.class);
        List<Employee> employees= theQuery.getResultList();
        return employees;
    }
}
