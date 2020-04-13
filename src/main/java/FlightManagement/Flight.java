package FlightManagement;

import java.util.ArrayList;
import java.util.List;

public abstract class Flight {
    private String id;
    private List<Passenger> passengers = new ArrayList<>();

    public abstract boolean addPassenger(Passenger passenger);
    public abstract boolean removePassenger(Passenger passenger);

    public Flight(String id) {
        this.id = id;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public String getId(){
        return id;
    }
}
