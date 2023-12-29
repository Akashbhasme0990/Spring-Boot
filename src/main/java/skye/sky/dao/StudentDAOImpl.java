package skye.sky.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import skye.sky.Entity.Student;

import java.util.List;
import java.util.spi.ToolProvider;

@Repository

public class StudentDAOImpl implements StudentDAO{
    //    define the field for entity manager
//     inject entity manager using constructor injection
//     implement save method
    private EntityManager entityManager;
    @Autowired
    public StudentDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void save(Student theStudent) {
        entityManager.persist(theStudent);
    }

    @Override
    public Student getElementByid(Integer id) {
        return entityManager.find(Student.class,id);
    }

    @Override
    public List<Student> findAll() {
        TypedQuery<Student> theQurey= entityManager.createQuery("FROM Student order by lastname",Student.class);
        return theQurey.getResultList();
    }

    @Override
    public List<Student> findByLastName(String theLastname) {
        TypedQuery<Student> theQurey= entityManager.createQuery("FROM Student WHERE lastname=:theData",Student.class);
        theQurey.setParameter("theData",theLastname);
        return theQurey.getResultList();
    }

    @Override
    @Transactional
    public void updateStudent(Student theStudent) {
        entityManager.merge(theStudent);
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        Student theStudent = entityManager.find(Student.class,id);
        entityManager.remove(theStudent);
    }

    @Override
    @Transactional
    public int deleteAll() {
        int noRowsDeleted= entityManager.createQuery("DELETE FROM Student").executeUpdate();
        return noRowsDeleted;
    }


}

