/**
 * File: [OOP_ClassRelationship_HAS_A_RonakBasnet].
 * By: [Ronak Basnet]
 * Date: [3/31/2024]
 * Description: [This program prints OOP]
 */


public class OOP_ClassRelationship_HAS_A_RonakBasnet {

    public static void main(String[] args) {

        Driver access = new Driver();

        access.carDetail();
        access.planeDetail();
        access.busDetail();
        access.diagram();


    }
}

class Driver {
    Vehicle vehicle = new Vehicle();

    public void carDetail() {
        System.out.println("----------------------------");
        System.out.println("--Car Details--" + "            |");
        vehicle.car.smallWheels();
        vehicle.car.smallWindows();
    }

    public void planeDetail() {
        System.out.println("--Plane Details--" + "          |");
        vehicle.plane.wings();
        vehicle.plane.bathroom();
    }

    public void busDetail() {
        System.out.println("--Bus Details--" + "            |");
        vehicle.bus.bigWheels();
        vehicle.bus.multipleSeats();
    }

    public void diagram() {
        System.out.println("--Diagram of the classes--\n");
        System.out.print("  | OOP_ClassRelationship_HAS_A_RonakBasnet |\n");
        int height = 3; // Height of the arrow

        // Draw the arrow
        for (int i = 1; i <= height; i++) {
            System.out.println("                      *");
        }
        System.out.println("                   |Driver|");
        for (int i = 1; i <= height; i++) {
            System.out.println("                      *");
        }
        System.out.println("                  |Vehicle|");
        for (int i = 1; i <= height; i++) {
            System.out.println("                      *");
        }

        System.out.printf("%18s", "  * * * * * * * * * * * * * * * * * * * * * * *");
        System.out.println();

        System.out.printf("  *%20s %23s", "*", "*");
        System.out.println();
        System.out.printf("  *%20s %23s\n", "*", "*");

        System.out.println("|Car|              |Plane|                  |Bus|");


    }

}

class Vehicle {
    public Car car = new Car();
    public Plane plane = new Plane();
    public Bus bus = new Bus();


}

//What does a car have that others do not?
class Car {

    // 2 methods here
    public void smallWheels() {
        System.out.println("The Car has small wheels." + "  |");

    }

    public void smallWindows() {
        System.out.println("The Car has small windows." + " |");
    }

}

//What does a plane have that others do not?
class Plane {
    //2 methods here
    public void wings() {
        System.out.println("The Plane has wings." + "       |");
    }

    public void bathroom() {
        System.out.println("The Plane has a bathroom." + "  |");
    }

}

//What does a bus have that others do not?
class Bus {
    //2 methods here
    public void bigWheels() {
        System.out.println("The Bus has big wheels." + "    |");
    }

    public void multipleSeats() {
        System.out.println("The Bus has multiple seats." + "|");
        for (int i = 0; i < 28; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

}




