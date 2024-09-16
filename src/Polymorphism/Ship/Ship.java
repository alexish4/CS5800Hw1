package Polymorphism.Ship;

public class Ship {
    protected String name;
    protected int year_built;

    public Ship(String name, int year_built) {
        this.name = name;
        this.year_built = year_built;
    }

    public Ship() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear_built() {
        return year_built;
    }

    public void setYear_built(int year_built) {
        this.year_built = year_built;
    }

    public void printShipInfo() {
        System.out.println("Name: " + name);
        System.out.println("Year Built: " + year_built);
    }
}
