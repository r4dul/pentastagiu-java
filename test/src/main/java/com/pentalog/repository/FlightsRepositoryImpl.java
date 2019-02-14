package com.pentalog.repository;

import com.pentalog.Flight;
import org.hibernate.SQLQuery;
import org.springframework.jdbc.object.SqlQuery;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Repository
public class FlightsRepositoryImpl {

    @PersistenceContext
    private EntityManager entityManager;

    public void save(Flight fl) {
        this.entityManager.merge(fl);
    }

    public Flight create(Flight flight) {
        entityManager.persist(flight);
        return flight;
    }

    public Flight findByName(String flightName){
        Query query = this.entityManager.createQuery("select fl from Flight fl where fl.name=:flightName");
        query.setParameter("flightName", flightName);
        return (Flight)query.getSingleResult();
    }
}
