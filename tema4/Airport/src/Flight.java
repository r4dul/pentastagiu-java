import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

enum StatusEnum {
    SCHEDULED, CANCELED, FINISHED;
}

public class Flight {
    private String name;
    private String destination;
    private Date date;
    private int flightDuration;
    private int maxUserCapacity;
    private StatusEnum status;
    private List<User> users = new ArrayList<>();
    Format formatData = new SimpleDateFormat("yyyy.MM.dd HH:mm");

    public void setDateTime(String str){
        try {
            this.date = (Date) formatData.parseObject(str);
        } catch(ParseException e) {
            System.out.println("Date string was not valid. Pattern = yyyy.MM.dd HH:mm ." + e.getStackTrace());
        }
    }

    public Flight(String name, String destination, String date, int flightDuration, int maxUserCapacity, StatusEnum status) {
        this.name = name;
        this.destination = destination;
        this.flightDuration = flightDuration;
        this.maxUserCapacity = maxUserCapacity;
        this.status = status;
        setDateTime(date);
    }
    public void getUsers(){
        if (users.size() == 0) {
            System.out.println("There are no registered passengers to the flight: " + getName());
            return;
        }
        System.out.println("The following passengers are registered to the flight: " + getName());
        for(User o: users) {
            System.out.println(o.getFname() + " " + o.getLname());
        }
    }

    public void addUser(User user) {
        if (users.size() >= maxUserCapacity) {
            System.out.println("No more passengers can be added to the flight: " + getName() + ". The plane is full. Capacity= " + getMaxUserCapacity());
            return ;
        }
        for(User o: users) {
            if (o.equals(user)) {
                System.out.println("The user is already added to the flight: " + this.name);
                return;
            }
        }
        users.add(user);
        System.out.println("User: " + user.getFname() + " " + user.getLname() + " was added to the flight: " + getName());
    }

    public void removeUser(User user) {
        if (users.size() == 0) {
            System.out.println("There are no users added to this flight: " + getName());
            return ;
        }
        Iterator<User> userIterator = users.iterator();
        while(userIterator.hasNext()) {
            if (userIterator.next().equals(user)){
                userIterator.remove();
                System.out.println("User: " + user.getLname() + " " + user.getFname() + " was removed from the flight: " + getName());
                return ;
            }
        }
        System.out.println("This user is not added to the flight: " + user.getFname() + " " + user.getLname());
    }

    public Boolean checkPassengerList(String name) {
        for (User u: users) {
            if (u.getFullName().equalsIgnoreCase(name)){
                return true;
            }
        }
        return false;
    }

    public int remainingSeats(){
        return getMaxUserCapacity() - users.size();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getFlightDuration() {
        return flightDuration;
    }

    public void setFlightDuration(int flightDuration) {
        this.flightDuration = flightDuration;
    }

    public int getMaxUserCapacity() {
        return maxUserCapacity;
    }

    public void setMaxUserCapacity(int maxUserCapacity) {
        this.maxUserCapacity = maxUserCapacity;
    }

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }
}
