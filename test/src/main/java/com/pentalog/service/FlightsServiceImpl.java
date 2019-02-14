package com.pentalog.service;

import com.pentalog.Flight;
import com.pentalog.repository.FlightsRepositoryImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional
public class FlightsServiceImpl {

    @Resource
    FlightsRepositoryImpl flightsRepository;

    public Flight createFlight(String name, String destination, String date, int flightDuration, int maxUserCapacity) {
        Flight newFlight = new Flight(name, destination, date, flightDuration, maxUserCapacity);
        return flightsRepository.create(newFlight);
    }
}
