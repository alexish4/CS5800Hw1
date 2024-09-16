package Polymorphism.Ship;

public class CruiseShip extends Ship {
    private int max_number_of_passengers;

    public CruiseShip() {
        super();
    }

    public CruiseShip(String name, int year_built, int max_number_of_passengers) {
        super(name, year_built);
        this.max_number_of_passengers = max_number_of_passengers;
    }

    public int getMax_number_of_passengers() {
        return max_number_of_passengers;
    }
    public void setMax_number_of_passengers(int max_number_of_passengers) {
        this.max_number_of_passengers = max_number_of_passengers;
    }

    @Override
    public void printShipInfo() {
        System.out.println("Name: " + name);
        System.out.println("Year Built: " + year_built);
        System.out.println("Max Number of Passengers: " + max_number_of_passengers);
    }
}
