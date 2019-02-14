package com.pentalog.repository;

import com.pentalog.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


@Repository
public class UsersRepositoryImpl {
    @PersistenceContext
    private EntityManager entityManager;

    public User create(User user){
        this.entityManager.persist(user);
        return user;
    }

    public void findByFirstName(String firstName) {
        String result = "ttttt";
        result = (String)this.entityManager.createQuery("Select usr.fname from User usr where usr.fname=:firstName")
        .setParameter("firstName", firstName).getSingleResult();
        System.out.println(result);
    }
}
