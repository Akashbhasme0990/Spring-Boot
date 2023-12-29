package skye.sky.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import skye.sky.Entity.Employee;
import skye.sky.Entity.Player;

import java.util.List;
@Repository
public class PlayerDAOImpl implements PlayerDAO{
    private EntityManager entityManager3;
    @Autowired
    public PlayerDAOImpl(EntityManager theEntityManager){
        entityManager3= theEntityManager;
    }
    @Override
    @GetMapping("/Players")
    public List<Player> getAll() {
        TypedQuery<Player> theQuery= entityManager3.createQuery("from Player", Player.class);
        List<Player> players= theQuery.getResultList();
        return players;
    }
}
