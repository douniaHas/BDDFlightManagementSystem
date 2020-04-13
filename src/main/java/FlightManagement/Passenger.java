package FlightManagement;

public class Passenger {
    private String name;
    private boolean vip;

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
}
