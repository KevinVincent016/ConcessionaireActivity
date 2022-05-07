package model;

public class Motorcycle extends Vehicle implements FuelConsumption{
    
    private double fuelCapacity;
    private double fuelConsume;
    
    private MotorcycleType theMotorcycleType;

    public Motorcycle(double basePrice, String brand, String model, int cylinderCapacity, int klm, int ownershipCard, String plate, int statusOption, Document theDocuments, double fuelCapacity, double fuelConsume){
        super(basePrice, brand, model, cylinderCapacity, klm, ownershipCard, plate, statusOption, theDocuments);
        this.fuelCapacity=fuelCapacity;
        this.fuelConsume=fuelConsume;
    }

    public double getFuelCapacity() {
        return this.fuelCapacity;
    }

    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public double getFuelConsume() {
        return this.fuelConsume;
    }

    public void setFuelConsume(double fuelConsume) {
        this.fuelConsume = fuelConsume;
    }

    public MotorcycleType getTheMotorcycleType() {
        return this.theMotorcycleType;
    }

    public void setTheMotorcycleType(MotorcycleType theMotorcycleType) {
        this.theMotorcycleType = theMotorcycleType;
    }

    public String toString(){
        return super.toString() + "\nMotorcycle Type: " + theMotorcycleType +
        "\nFuel capacity: " + fuelCapacity +
        "\nFuel consume: " + fuelConsume;
    }

    public double calculateFuelConsume(){
        return 0.0;
    }
}
