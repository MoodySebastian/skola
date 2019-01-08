package com.example.demofimkf.dao;

import com.example.demofimkf.domain.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class JpaUserdao implements Userdao {
    @PersistenceContext
    private EntityManager em;

    @Override
    public void create(User user)
    {
        em.persist(user);
    }

    @Override
    public User findById(long id)
    {
        return new User();
        //return  em.createQuery("SELECT u FROM User u WHERE u.Id = :id").setParameter("id", id).getSingleResult();
    }

    @Override
    public List<User> findAll()
    {
        return em.createQuery("SELECT u FROM User u").getResultList();
    }
}
