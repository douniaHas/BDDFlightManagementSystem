package FlightManagement;

import java.util.ArrayList;
import java.util.List;

public class Passenger {
    private String name;
    private boolean vip;
    private boolean companyChoice;
    private List<String> products = new ArrayList<>();
    private int points;

    public boolean isVip() {
        return vip;
    }

    public Passenger(String name, boolean vip) {
        this.name = name;
        this.vip = vip;
    }

    public String getName() {
        return name;
    }

    public boolean hasCompanyChoice() {
        return companyChoice;
    }

    public void setCompanyChoice(boolean companyChoice) {
        this.companyChoice = companyChoice;
    }

    public void addProducts(List<String> products) {
        this.products.addAll(products); 
    }

    public boolean gotPoints() {
        return points!=0;
    }
}
