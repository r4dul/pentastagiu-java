package com.pentalog;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("airport-application-context.xml");

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
        flightManager.getFlights();
    }
}
