import FlightManagement.BusinessFlight;
import FlightManagement.EconomyFlight;
import FlightManagement.Flight;
import FlightManagement.Passenger;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PassengersPolicy {
    private Flight economyFlight;
    private Flight businessFlight;
    private Passenger mike;
    private Passenger john;

    @Given("there is an economy flight")
    public void givenThereIsAnEconomyFlight() {
        economyFlight = new EconomyFlight("1");
    }

    @When("we have a usual passenger")
    public void whenWeHaveAUsualPassenger() {
        mike  = new Passenger("Mike", false);
    }

    @Then("you can add and remove him from an economy flight")
    public void thenYouCanAddAndRemoveHimFromAnEconomyFlight() {
        assertAll("Verify all conditions for a usual passenger and an economy flight",
                () -> assertEquals("1", economyFlight.getId()),
                () -> assertEquals(true, economyFlight.addPassenger(mike)),
                () -> assertEquals(1, economyFlight.getPassengers().size()),
                () -> assertEquals("Mike", economyFlight.getPassengers().get(0).getName()),
                () -> assertEquals(true, economyFlight.removePassenger(mike)),
                () -> assertEquals(0, economyFlight.getPassengers().size())
        );
    }

    @When("we have a VIP passenger")
    public void whenWeHaveAVipPassenger() {
        john = new Passenger("John", true);
    }

    @Then("you can add him but cannot remove him from an economy flight")
    public void thenYouCanAddHimButCannotRemoveHimFromAnEconomyFlight() {
        assertAll("Verify all conditions for a VIP passenger and an economy flight",
                () -> assertEquals("1", economyFlight.getId()),
                () -> assertEquals(true, economyFlight.addPassenger(john)),
                () -> assertEquals(1, economyFlight.getPassengers().size()),
                () -> assertEquals("John", economyFlight.getPassengers().get(0).getName()),
                () -> assertEquals(false, economyFlight.removePassenger(john)),
                () -> assertEquals(1, economyFlight.getPassengers().size())
        );
    }

    @Given("there is an business flight")
    public void givenThereIsAnBusinessFlight() {
        businessFlight = new BusinessFlight("2");
    }

    @Then("you cannot add or remove him from a business flight")
    public void thenYouCannotAddOrRemoveHimFromABusinessFlight() {
        assertAll("Verify all conditions for a usual passenger and a business flight",
                () -> assertEquals(false, businessFlight.addPassenger(mike)),
                () -> assertEquals(0, businessFlight.getPassengers().size()),
                () -> assertEquals(false, businessFlight.removePassenger(mike)),
                () -> assertEquals(0, businessFlight.getPassengers().size())
        );
    }

    @Then("you can add him but cannot remove him from a business flight")
    public void thenYouCanAddHimButCannotRemoveHimFromABusinessFlight() {
        assertAll("Verify all conditions for a VIP passenger and a business flight",
                () -> assertEquals(true, businessFlight.addPassenger(john)),
                () -> assertEquals(1, businessFlight.getPassengers().size()),
                () -> assertEquals(false, businessFlight.removePassenger(john)),
                () -> assertEquals(1, businessFlight.getPassengers().size())
        );

    }
}
