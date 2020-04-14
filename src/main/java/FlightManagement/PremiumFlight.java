package FlightManagement;

public class PremiumFlight extends Flight {
    @Override
    public boolean addPassenger(Passenger passenger) {
        if(passenger.isVip()){
            return getPassengers().add(passenger);
        }
        return false;
    }

    @Override
    public boolean removePassenger(Passenger passenger) {
        if(passenger.isVip()){
            return getPassengers().remove(passenger);
        }
        return false;
    }

    public PremiumFlight(String id) {
        super(id);
    }
}
