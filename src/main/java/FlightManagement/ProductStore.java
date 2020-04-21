package FlightManagement;

import java.util.HashMap;
import java.util.Map;

public class ProductStore {
    Map<String , String > productCategory = new HashMap<>();
    Map<String, Integer> productPoints = new HashMap<>();

    public void add(String product, String category, Integer points) {
        productCategory.put(product, category);
        productPoints.put(product, points);
    }
}
