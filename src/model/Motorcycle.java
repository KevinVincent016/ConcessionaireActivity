package model;

public class Motorcycle extends Vehicle implements FuelConsumption{
    
    private double fuelCapacity;
    private double fuelConsume;
    
    private MotorcycleType theMotorcycleType;

    public Motorcycle(double basePrice, String brand, int model, int cylinderCapacity, int klm, OwnershipCard ownershipCard, String plate, int statusOption, SOAT theSoat, Tecnomechanics theTecnomechanics, double fuelCapacity, int motoOption){
        super(basePrice, brand, model, cylinderCapacity, klm, ownershipCard, plate, statusOption, theSoat, theTecnomechanics);
        this.fuelCapacity=fuelCapacity;
        this.fuelConsume=calculateFuelConsume();
        switch(motoOption){
            case 1:
            theMotorcycleType = MotorcycleType.CROSS;
            break;

            case 2:
            theMotorcycleType = MotorcycleType.DEPORTIVA;
            break;

            case 3:
            theMotorcycleType = MotorcycleType.ESTANDAR;
            break;

            case 4:
            theMotorcycleType = MotorcycleType.SCOOTER;
            break;
        }
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
        double fuelConsume = fuelCapacity*(super.getCylinderCapacity()/75);
        return fuelConsume;
    }
}
