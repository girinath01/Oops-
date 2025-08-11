class Vehicle {
    void start() {
        System.out.println("Vehicle is starting");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving");
    }
}

class SportsCar extends Car {
    void turbo() {
        System.out.println("SportsCar turbo mode activated");
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println("Single Inheritance:");
        car.start();
        car.drive();

        System.out.println();

        SportsCar sportsCar = new SportsCar();
        System.out.println("Multilevel Inheritance:");
        sportsCar.start();
        sportsCar.drive();
        sportsCar.turbo();
    }
}
