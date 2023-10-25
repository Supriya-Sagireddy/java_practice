package inheritace.VechileInherit;

// Vehicle.java
public class Vehicle {
    private String brand;
    private double speed;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
    public double getSpeed(){
        return speed;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }

    public void fuelConsumption() {
        System.out.println("Fuel consumption is not applicable for this vehicle.");
    }
}


