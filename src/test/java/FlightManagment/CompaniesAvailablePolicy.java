package FlightManagment;

import FlightManagement.BusinessFlight;
import FlightManagement.Flight;
import FlightManagement.Passenger;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CompaniesAvailablePolicy {
    private Flight flight;
    private Passenger John = new Passenger("John", true);

    @When("there is a business flight to :")
    public void thereIsABusinessFlightTo(List<String> destinations) {
        flight = new BusinessFlight("id");
        flight.getCompanies().addAll(Arrays.asList("Lufthansa", "Air France"));
        flight.addPassenger(John);
        flight.getDestinations().addAll(destinations);
    }

    @Then("He can choose a company")
    public void heCanChooseACompany() {
        assertTrue(John.hasCompanyChoice());
    }
}
