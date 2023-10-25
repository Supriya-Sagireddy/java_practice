package inheritace.VechileInherit;

// Car.java
public class Car extends Vehicle{
    private double fuelEfficiency;

    public Car(String brand, double fuelEfficiency) {
        super(brand);
        this.fuelEfficiency = fuelEfficiency;
    }

    @Override
    public void fuelConsumption() {
        double speed = getSpeed();
        double consumption = 100.0 / fuelEfficiency / speed;
        System.out.println("Fuel consumption: " + consumption + " liters per 100 km");
    }
}

