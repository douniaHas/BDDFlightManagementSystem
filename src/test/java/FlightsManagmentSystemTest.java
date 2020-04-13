import FlightManagement.BusinessFlight;
import FlightManagement.EconomyFlight;
import FlightManagement.Flight;
import FlightManagement.Passenger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlightsManagmentSystemTest {
    private Passenger mike = new Passenger("Mike", false);
    private Passenger john = new Passenger("John", true);

    @DisplayName("Given an economy flight")
    @Nested
    class EconomyFlightTest {
        private Flight economyFlight;

        @BeforeEach
        public void setUp() {
            economyFlight = new EconomyFlight("1");
        }

        @DisplayName("When we have a usual passenger")
        @Nested
        public class UsualPassenger {
            @DisplayName("Then you can not add him or remove him from the flight")
            @Test
            public void should_add_and_remove_usual_passenger_to_economy_flight() {
                assertEquals("1", economyFlight.getId());
                assertEquals(true, economyFlight.addPassenger(mike));
                assertEquals(1, economyFlight.getPassengers().size());
                assertEquals("Mike", economyFlight.getPassengers().get(0).getName());

                assertEquals(true, economyFlight.removePassenger(mike));
                assertEquals(0, economyFlight.getPassengers().size());
            }

        }


        @DisplayName("When we have a VIP passenger")
        @Nested
        public class VIPPassenger {
            @DisplayName("Then you can add him but not remove him from the flight")
            @Test
            public void should_add_but_not_remove_vip_passenger_from_economy_flight() {
                assertEquals("1", economyFlight.getId());
                assertEquals(true, economyFlight.addPassenger(john));
                assertEquals(1, economyFlight.getPassengers().size());
                assertEquals("John", economyFlight.getPassengers().get(0).getName());

                assertEquals(false, economyFlight.removePassenger(john));
                assertEquals(1, economyFlight.getPassengers().size());
            }

        }

    }

    @DisplayName("Given a business flight")
    @Nested
    class BusinessFlightTest {
        private Flight businessFlight;

        @BeforeEach
        public void setUp() {
            businessFlight = new BusinessFlight("2");
        }

        @DisplayName("When you have a usual passenger")
        @Nested
        public class UsualPassenger {
            @DisplayName("Then you can't add him nor remove him from the flight")
            @Test
            public void should_not_add_nor_remove_usual_passenger_from_business_flight() {
                assertEquals(false, businessFlight.addPassenger(mike));
                assertEquals(0, businessFlight.getPassengers().size());
                assertEquals(false, businessFlight.removePassenger(mike));
                assertEquals(0, businessFlight.getPassengers().size());
            }
        }


        @DisplayName("When you have a VIP passenger")
        @Nested
        public class VIPPassenger {
            @DisplayName("Then you can add him but not remove him from the flight")
            @Test
            public void should_add_but_not_remove_vip_passenger_to_business_flight() {
                assertEquals(true, businessFlight.addPassenger(john));
                assertEquals(1, businessFlight.getPassengers().size());
                assertEquals(false, businessFlight.removePassenger(john));
                assertEquals(1, businessFlight.getPassengers().size());
            }
        }

    }

}
