class Vehicle {
    void start() {
        System.out.println("Vehicle Starts");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car Starts");
    }
}

class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike Starts");
    }
}

public class VehicleArray {
    public static void main(String[] args) {

        Vehicle[] vehicles = {
                new Car(),
                new Bike(),
                new Car()
        };

        for (Vehicle v : vehicles) {
            v.start();
        }
    }
}
