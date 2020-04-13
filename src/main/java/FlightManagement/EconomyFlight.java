package FlightManagement;

public class EconomyFlight extends Flight {
    @Override
    public boolean addPassenger(Passenger passenger) {
        return getPassengers().add(passenger);
    }

    @Override
    public boolean removePassenger(Passenger passenger) {
        if(!passenger.isVip()){
            return getPassengers().remove(passenger);
        }
        return false;
    }

    public EconomyFlight(String id) {
        super(id);
    }
}
