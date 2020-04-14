package FlightManagement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Mileage {


    private static final Integer VIP_BONUS_QUOTIENT = 10;
    private static final Integer USUAL_BONUS_QUOTIENT = 20;
    private Map<Passenger, Integer> passengersAndMileages = new HashMap<>();

    public void add(Passenger passenger, int mileage) {
        if(!passengersAndMileages.containsKey(passenger)){
            passengersAndMileages.put(passenger, mileage);
        }
        else {
            passengersAndMileages.put(passenger,
                    passengersAndMileages.get(passenger).intValue() + mileage);
        }
    }

    public int calculateBonus(Passenger passenger) {
        Integer quotient = passenger.isVip()?VIP_BONUS_QUOTIENT:USUAL_BONUS_QUOTIENT;
        return passengersAndMileages.get(passenger)/quotient;
    }
}
