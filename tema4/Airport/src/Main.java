import java.util.Date;

public class Main {
    public static void main(String[] args) {
        FlightManager flightManager = new FlightManager();

        User user1 = new User("Radu", "Ionica","1987.10.21");
        User user2 = new User("Maria", "Ioana","1985.05.11");
        User user3 = new User("Ioana", "Maria","1987.07.23");
        User user4 = new User("Dumitru", "Dan","1987.10.04");
        User user5 = new User("Marius", "Marcel","1987.12.21");

        System.out.println(user1.getBirthDate());
        Flight flight = new Flight("FL-201", "Maroc", "2019.01.21 10:11", 200, 2, StatusEnum.SCHEDULED);
        Flight flight1 = new Flight("BOM-555", "Bucuresti", "2019.01.22 10:11", 190, 12, StatusEnum.FINISHED);
        flightManager.addFlight(new Flight("BOM-555", "Bucuresti", "2019.01.23 22:11", 190, 12, StatusEnum.SCHEDULED));

        flightManager.addFlight(flight);
        flightManager.addFlight(flight1);
        flightManager.addUserToFlight(user1, flight);
        flightManager.getPassengers(flight);
        flightManager.removeUserFromFlight(user1, flight);
        flightManager.addUserToFlight(user2, flight);
        flightManager.addUserToFlight(user3, flight);
        flightManager.addUserToFlight(user4, flight);
        flightManager.getPassengers(flight);
        flightManager.getFlights();
        flightManager.removeFlight(flight1);

        //remove flight by flight name
        flightManager.addFlight(new Flight("KKK", "Bucuresti", "2019.01.07 14:11", 190, 12, StatusEnum.SCHEDULED));
        flightManager.removeFlightName("KKK");
        flightManager.addPassenger(new User("Marius", "Marcel","1987.12.21"));
        flightManager.removeUserByName("Marius Marcel");

        //asign passenger to flight by passenger name and flight name
        //flightManager.addPassenger(user4);
        flightManager.getPassengers();
        flightManager.addPassengerToFlight("Dumitru Dan", "FL-201");
        flightManager.addPassengerToFlight("Dumitru Dan", "BOM-555");

        //adding flights and users
        flightManager.addFlight(new Flight("AM-166", "Amsterdam", "2019.01.22 10:11", 60, 48, StatusEnum.FINISHED));
        flightManager.addPassengerToFlight("Dumitru Dan", "AM-166");
        flightManager.addPassengerToFlight("Radu Ionica", "BOM-555");
        flightManager.addPassengerToFlight("Ioana Maria", "AM-166");
        flightManager.addPassengerToFlight("Maria Ioana", "BOM-555");
        flightManager.passengerFlights("Dumitru Dan");
        flightManager.totalPassengerFlights("Dumitru Dan");
        flightManager.visitedDestinations("Dumitru Dan");
        flightManager.scheduledDestinations("Dumitru Dan");
        flightManager.totalVisitedDestinations("Dumitru Dan");
        //update flights
        flightManager.showFlightsStatus();
        flightManager.updateFlights();
        flightManager.showFlightsStatus();
        //show flights with status argument
        flightManager.showFlightsStatus(StatusEnum.FINISHED);
    }
}
