package model;

public class GasolineCar extends Car implements FuelConsumption{
    
    private double fuelCapacity;
    private double fuelConsume;
    private FuelType fuelType;

    public GasolineCar(double basePrice, String brand, String model, int cylinderCapacity, int klm, int ownershipCard, String plate, int statusOption, Document theDocuments, int doorsNumber, boolean polarization, int cartype, double fuelCapacity, double fuelConsume, int fuelOption){
        super(basePrice, brand, model, cylinderCapacity, klm, ownershipCard, plate, statusOption, theDocuments, doorsNumber, polarization, cartype);
        this.fuelCapacity = fuelCapacity;
        this.fuelConsume = fuelConsume;
        fuelType = null;
        switch(fuelOption){
            case 1:
            fuelType = FuelType.EXTRA;
            break;
            case 2:
            fuelType = FuelType.CORRIENTE;
            break;
            case 3:
            fuelType = FuelType.DIESEL;
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

    public FuelType getFuelType() {
        return this.fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public double calculateFuelConsume(){
        double consume = 0.0;
        return consume;
    }

}
