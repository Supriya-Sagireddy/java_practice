package inheritace.VechileInherit;
// Bicycle.java
public class Bicycle extends Vehicle{
    private int gear;

    public Bicycle(String brand) {
        super(brand);
        gear = 1; // Default gear
    }

    public void changeGear(int newGear) {
        gear = newGear;
    }

    @Override
    public void fuelConsumption() {
        System.out.println("Bicycles do not consume fuel.");
    }

    public void pedalCadence() {
        System.out.println("Pedal cadence: " + (gear * getSpeed()) + " RPM");
    }
}

