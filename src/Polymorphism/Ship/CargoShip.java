package Polymorphism.Ship;

public class CargoShip extends Ship {
    private int cargo_capacity;
    public CargoShip(String name, int year_built, int cargo_capacity) {
        super(name, year_built);
        this.cargo_capacity = cargo_capacity;
    }
    public CargoShip() {
        super();
    }
    public int getCargo_capacity() {
        return cargo_capacity;
    }
    public void setCargo_capacity(int cargo_capacity) {
        this.cargo_capacity = cargo_capacity;
    }
    @Override
    public void printShipInfo() {
        System.out.println("Name: " + name);
        System.out.println("Year Built: " + year_built);
        System.out.println("Max Cargo Capacity: " + cargo_capacity);
    }
}
