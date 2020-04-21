package FlightManagment;

import FlightManagement.BusinessFlight;
import FlightManagement.Flight;
import FlightManagement.Passenger;
import FlightManagement.ProductStore;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class MerchandisePointsPolicy {
    private Flight flight = new BusinessFlight("id");
    private Passenger John = new Passenger("John", true);
    private ProductStore productsStore = new ProductStore();

    //TODO regler le pb des definitions qui ne sont pas dans le meme fichier de test ou elles sont utilisees

    @And("there are points for these products")
    public void thereArePointsForTheseProducts(List<Map<String, String>> products) {
        products.stream().forEach(
                drinkCategory -> {
                    String drink = drinkCategory.get("Drink");
                    String category = drinkCategory.get("Category");
                    Integer points = Integer.parseInt(drinkCategory.get("Points"));

                    productsStore.add(drink, category, points);
                }
        );
        flight.addProductStore(productsStore);
    }

    @And("he buys a <product>")
    public void heBuysAProduct(List<String> products) {
            John.addProducts(products);
    }

    //TODO code not implemented yet
    @Then("he got points for these products")
    public void heGotPointsForTheseProducts() {
        assertFalse(John.gotPoints());
    }
}
