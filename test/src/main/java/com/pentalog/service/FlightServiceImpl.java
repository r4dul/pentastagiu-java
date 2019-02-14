package com.pentalog.service;
import com.pentalog.model.FlightEntity;
import com.pentalog.model.UserEntity;
import com.pentalog.repository.UserRepositoryImpl;
import com.pentalog.repository.api.FlightRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional
public class FlightServiceImpl {

    @Resource
    private FlightRepository flightRepository;

    @Resource
    private UserRepositoryImpl userRepository;

    public FlightEntity createFlight(String flightName) {
        FlightEntity newFlight = new FlightEntity(flightName);
        return flightRepository.create(newFlight);
    }

    public UserEntity createUser(String email, String fname, String lname) {
        UserEntity userEntity = new UserEntity(email,fname,lname);
        return userRepository.create(userEntity);
    }

    public void asignFlightToUser(String email, String flightName) {
        FlightEntity flightEntity = flightRepository.findByName(flightName);
        UserEntity userEntity = userRepository.findByEmail(email);

        flightEntity.getPassangers().add(userEntity);
        flightRepository.save(flightEntity);
    }
}
