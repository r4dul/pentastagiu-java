package com.pentalog.repository;

import com.pentalog.model.FlightEntity;
import com.pentalog.repository.api.FlightRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Repository
public class FlightRepositoryImpl implements FlightRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public FlightEntity create(FlightEntity flightToCreate) {
        entityManager.persist(flightToCreate);
        return flightToCreate;
    }

    public void save(FlightEntity fl) {
        this.entityManager.merge(fl);
    }

    public FlightEntity findByName(String flightName) {
        Query query = this.entityManager.createQuery("select fl from FlightEntity fl where fl.name=:flightName");
        query.setParameter("flightName", flightName);
        return (FlightEntity)query.getSingleResult();
    }
}
