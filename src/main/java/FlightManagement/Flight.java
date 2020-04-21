package FlightManagement;

import java.util.ArrayList;
import java.util.List;

public abstract class Flight {
    protected ProductStore productStore;
    private String id;
    private List<Passenger> passengers = new ArrayList<>();


    private List<String> destinations  = new ArrayList<>();
    private List<String> companies  = new ArrayList<>();

    public abstract boolean addPassenger(Passenger passenger);
    public abstract boolean removePassenger(Passenger passenger);

    public Flight(String id) {
        this.id = id;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }
    public List<String> getDestinations() {
        return destinations;
    }
    public List<String> getCompanies() {
        return companies;
    }

    public String getId(){
        return id;
    }

    public void addProductStore(ProductStore productsStore){
        this.productStore = productsStore;
    };
}
