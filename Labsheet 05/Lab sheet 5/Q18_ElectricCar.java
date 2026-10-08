interface Electric {
    void chargeBattery();
}

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

class ElectricCar extends Car implements Electric {
    public void chargeBattery() {
        System.out.println("Electric car is charging");
    }
}

public class Q18_ElectricCar {
    public static void main(String[] args) {
        ElectricCar e = new ElectricCar();

        e.start();
        e.drive();
        e.chargeBattery();
    }
}
