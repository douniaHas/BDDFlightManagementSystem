package FlightManagement;

public class BusinessFlight extends Flight {
    @Override
    public boolean addPassenger(Passenger passenger) {
        if(passenger.isVip()){
            if(!getCompanies().isEmpty()){
                passenger.setCompanyChoice(true);
            }
            return getPassengers().add(passenger);
        }
        return false;
    }

    @Override
    public boolean removePassenger(Passenger passenger) {
        return false;
    }

    public BusinessFlight(String id) {
        super(id);
    }

}
