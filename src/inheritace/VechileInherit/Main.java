package inheritace.VechileInherit;

// Main.java
public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 12.0);
        Bicycle bicycle = new Bicycle("Trek");

        car.setSpeed(60.0);
        bicycle.setSpeed(20.0);
        bicycle.changeGear(3);

        System.out.println("Car Information:");
        car.displayInfo();
        car.fuelConsumption();

        System.out.println("\nBicycle Information:");
        bicycle.displayInfo();
        bicycle.fuelConsumption();
        bicycle.pedalCadence();
    }
}

