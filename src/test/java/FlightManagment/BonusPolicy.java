package FlightManagment;

import FlightManagement.Mileage;
import FlightManagement.Passenger;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class BonusPolicy {
    private Passenger mike;
    private Mileage mileage;
    private Passenger john;

    @Given("^There is a usual passenger with a mileage$")
    public void thereIsAUsualPassengerWithAMileage() {
        mike = new Passenger("Mike", false);
        mileage = new Mileage();
    }

    @When("^the usual passenger travels (\\d+) and (\\d+) and (\\d+)$")
    public void theUsualPassengerTravelsAndAnd(int mileage1, int mileage2, int mileage3) throws Throwable {
        mileage.add(mike, mileage1);
        mileage.add(mike, mileage2);
        mileage.add(mike, mileage3);
    }

    @Then("^the bonus points of the usual passenger should be (\\d+)$")
    public void theBonusPointsOfTheUsualPassengerShouldBe(int bonus) throws Throwable {
        Assert.assertEquals(bonus, mileage.calculateBonus(mike));
    }

    @Given("^There is a VIP passenger with a mileage$")
    public void thereIsAVIPPassengerWithAMileage() throws Throwable {
        john = new Passenger("John", true);
        mileage = new Mileage();
    }

    @When("^the VIP passenger travels (\\d+) and (\\d+) and (\\d+)$")
    public void theVIPPassengerTravelsAndAnd(int mileage1, int mileage2, int mileage3) throws Throwable {
        mileage.add(john, mileage1);
        mileage.add(john, mileage2);
        mileage.add(john, mileage3);
    }

    @Then("^the bonus points of the VIP passenger should be (\\d+)$")
    public void theBonusPointsOfTheVIPPassengerShouldBe(int bonus) throws Throwable {
        Assert.assertEquals(bonus, mileage.calculateBonus(john));
    }

}
