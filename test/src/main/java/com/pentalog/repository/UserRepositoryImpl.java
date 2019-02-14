package com.pentalog.repository;

import com.pentalog.model.UserEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Repository
public class UserRepositoryImpl {
    @PersistenceContext
    private EntityManager entityManager;

    public UserEntity create(UserEntity userEntity) {
        this.entityManager.persist(userEntity);
        return userEntity;
    }

    public UserEntity findByEmail(String email) {
        Query query = this.entityManager.createQuery("Select usr from UserEntity usr where usr.email=:userEmail");
        query.setParameter("userEmail", email);
        return (UserEntity) query.getSingleResult();
    }
}
