package javax;

import java.util.*;

class Garage {
    private final static List<Vehicle> vehicleList = new LinkedList<Vehicle>();

    public static synchronized void addVehicle(Vehicle vehicle) {
        vehicleList.add(vehicle);
    }

    public static synchronized List<Vehicle> getVehicles() {
        return vehicleList;
    }
}

enum Make {
    BMW,
    Ford,
    Porsche,
    Toyota
}

class Vehicle {
    private final Make make;
    private final int wheelCount;

    protected Vehicle(final Make make, final int wheelCount) {
        this.make = make;
        this.wheelCount = wheelCount;
    }

    protected Make getMake() { return make; }
    protected int getWheelCount() { return wheelCount; }
}

class Truck extends Vehicle {
    public Truck(Make make) {
        super(make, 18);
    }
}

class Car extends Vehicle {
    public Car(Make make) {
        super(make, 4);
    }
}

interface Convertible {
    void openTop();
    void closeTop();
}

class SportsCar extends Car implements Convertible {
    private boolean topOpen = false;

    public SportsCar(Make make) {
        super(make);
    }

    @Override
    public void openTop() {
        if (topOpen) {
            System.out.println("Top is open");
        } else {
            System.out.println("Opening top");
            topOpen = true;
        }
    }

    @Override
    public void closeTop() {
        if (topOpen) {
            System.out.println("Closing top");
            topOpen = false;
        } else {
            System.out.println("Top is closed");
        }
    }


    public static SportsCar newSportsCar(String makeStr) {
        Make make = Make.valueOf(makeStr);
        return new SportsCar(make);
    }
}

public class ClassesTraitsObjects {
    public static void main(String[] args) {
        Garage.addVehicle(new SportsCar(Make.Porsche));
        Garage.addVehicle(SportsCar.newSportsCar("BMW"));
        Garage.addVehicle(new Truck(Make.Ford));
        Garage.addVehicle(new Truck(Make.Toyota));

        for (Vehicle vehicle : Garage.getVehicles()) {
            System.out.println("This vehicle is a " + vehicle.getMake() + " and has " + vehicle.getWheelCount() + " wheels");
            if (vehicle instanceof Convertible) {
                System.out.println("Oooh, this vehicle is a convertible. Let's play with the top!");
                Convertible convertible = (Convertible)vehicle;
                convertible.openTop();
                convertible.openTop();
                convertible.closeTop();
                convertible.closeTop();
            }
        }
    }
}
