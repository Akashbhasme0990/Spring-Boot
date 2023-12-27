package skye.sky.dao;

import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import skye.sky.Entity.User;
@Repository
public class UserDAOImpl implements  UserDAO{

    private EntityManager entityManagerUser;
    @Autowired
    public UserDAOImpl(EntityManager entityManagerUser) {
        this.entityManagerUser = entityManagerUser;
    }
    @Override
    @Transactional
    public void save(User theUser) {
      entityManagerUser.merge(theUser);
    }
}
