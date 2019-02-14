package com.pentalog;

import com.pentalog.repository.FlightRepositoryImpl;
import com.pentalog.repository.FlightsRepositoryImpl;
import com.pentalog.repository.UsersRepositoryImpl;
import com.pentalog.service.FlightServiceImpl;
import com.pentalog.service.FlightsServiceImpl;
import com.pentalog.service.UsersServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
/*        ApplicationContext context = new ClassPathXmlApplicationContext("airport-application-context.xml");

        User user = context.getBean(User.class);
        System.out.println(user.getFullName());

        Flight flight = context.getBean(Flight.class);
        System.out.println(flight.getStatus());

        Flight flight1 = context.getBean(Flight.class);
        flight1.setDestination("amsterdam");
        flight1.setName("FL-657");
        System.out.println(flight1.getDestination());

        FlightManager flightManager = context.getBean(FlightManager.class);
        flightManager.addFlight(flight1);
        flightManager.getFlights();*/

        ApplicationContext context = new ClassPathXmlApplicationContext("airport-application-context.xml");
        FlightsServiceImpl airportManager = (FlightsServiceImpl) context.getBean(FlightsServiceImpl.class);
/*        airportManager.createFlight("BV-555");
        airportManager.createFlight("DD-411");
        airportManager.createFlight("CZ-222");*/

        //airportManager.createFlight("BOM-555", "Bucuresti", "2019.01.23 22:11", 190, 12);
/*        UsersServiceImpl userManager = (UsersServiceImpl) context.getBean(UsersServiceImpl.class);
        userManager.createUser("Marius", "Marcel","1987.12.21");*/
        UsersRepositoryImpl usersRepository = new UsersRepositoryImpl();
        usersRepository.findByFirstName("Radu");
    }
}
