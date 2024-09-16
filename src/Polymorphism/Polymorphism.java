package Polymorphism;

import Polymorphism.Ship.*;
import java.util.Scanner;

public class Polymorphism {
    public static void main(String[] args) {
        shipDynamicProgram();
    }
    public static void shipDynamicProgram() {
        Ship[] ship_array = new Ship[3];

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Welcome to the Dynamic Polymorphism.Polymorphism.Ship Program!");
        System.out.println();

        System.out.print("Please Enter Polymorphism.Polymorphism.Ship's Name: ");
        String ship_name = keyboard.nextLine();
        System.out.print("Please Enter the Year the Polymorphism.Polymorphism.Ship was Built: ");
        int year = keyboard.nextInt();
        keyboard.nextLine(); // Consume leftover newline
        ship_array[0] = new Ship(ship_name, year);

        System.out.println();
        System.out.print("Please Enter Cruise Polymorphism.Polymorphism.Ship's Name: ");
        ship_name = keyboard.nextLine();
        System.out.print("Please Enter the Year the Cruise Polymorphism.Polymorphism.Ship was Built: ");
        year = keyboard.nextInt();
        System.out.print("Please Enter Cruise Polymorphism.Polymorphism.Ship's Max Number of Passengers: ");
        int max_passengers = keyboard.nextInt();
        keyboard.nextLine(); // Consume leftover newline
        ship_array[1] = new CruiseShip(ship_name, year, max_passengers);

        System.out.println();
        System.out.print("Please Enter Cargo Polymorphism.Polymorphism.Ship's Name: ");
        ship_name = keyboard.nextLine();
        System.out.print("Please Enter the Year the Cargo Polymorphism.Polymorphism.Ship was Built: ");
        year = keyboard.nextInt();
        System.out.print("Please Enter Cargo Polymorphism.Polymorphism.Ship's Cargo Capacity: ");
        int cargo_capacity = keyboard.nextInt();
        ship_array[2] = new CargoShip(ship_name, year, cargo_capacity);

        keyboard.close();

        System.out.println();
        System.out.print("Printing Array of Ships: ");
        System.out.println();
        for(Ship ship : ship_array) {
            ship.printShipInfo();
            System.out.println();
        }
    }
}
