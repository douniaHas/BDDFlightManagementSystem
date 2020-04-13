import FlightManagement.BusinessFlight;
import FlightManagement.EconomyFlight;
import FlightManagement.Flight;
import FlightManagement.Passenger;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightsManagmentSystemTest {

    @Test
    public void should_add_usual_passenger_to_economy_flight_and_remove_it() {
        Flight economyFlight = new EconomyFlight("1");
        Passenger mike = new Passenger("Mike", false);

        assertEquals("1", economyFlight.getId());
        assertEquals(true, ((EconomyFlight) economyFlight).addPassenger(mike));
        assertEquals(1, economyFlight.getPassengers().size());
        assertEquals("Mike", economyFlight.getPassengers().get(0).getName());

        assertEquals(true, ((EconomyFlight) economyFlight).removePassenger(mike));
        assertEquals(0, economyFlight.getPassengers().size());
    }

    @Test
    public void testEconomyFlightVipPassenger() {
        Flight economyFlight = new EconomyFlight("1");
        Passenger john = new Passenger("John", true);

        assertEquals("1", economyFlight.getId());
        assertEquals(true, ((EconomyFlight) economyFlight).addPassenger(john));
        assertEquals(1, economyFlight.getPassengers().size());
        assertEquals("John", economyFlight.getPassengers().get(0).getName());

        assertEquals(false, ((EconomyFlight) economyFlight).removePassenger(john));
        assertEquals(1, economyFlight.getPassengers().size());
    }

    @Test
    public void testBusinessFlightUsualPassenger() {
        Flight businessFlight = new BusinessFlight("2");

        Passenger mike = new Passenger("Mike", false);

        assertEquals(false, ((BusinessFlight) businessFlight).addPassenger(mike));
        assertEquals(0, businessFlight.getPassengers().size());
        assertEquals(false, ((BusinessFlight) businessFlight).removePassenger(mike));
        assertEquals(0, businessFlight.getPassengers().size());

    }
//TODO : why cast businessFlight.addPassenger(john) ?
    @Test
    public void testBusinessFlightVipPassenger() {
        Flight businessFlight = new BusinessFlight("2");

        Passenger john = new Passenger("John", true);

        assertEquals(true, ((BusinessFlight) businessFlight).addPassenger(john));
        assertEquals(1, businessFlight.getPassengers().size());
        assertEquals(false, ((BusinessFlight) businessFlight).removePassenger(john));
        assertEquals(1, businessFlight.getPassengers().size());

    }
}
