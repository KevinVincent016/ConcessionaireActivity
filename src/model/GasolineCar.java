package model;

public class GasolineCar extends Car implements FuelConsumption{
    
    private double fuelCapacity;
    private double fuelConsume;
    private FuelType fuelType;

    public GasolineCar(double basePrice, String brand, int model, int cylinderCapacity, int klm, OwnershipCard ownershipCard, String plate, int statusOption, SOAT theSoat, Tecnomechanics theTecnomechanics, int doorsNumber, boolean polarization, int cartype, double fuelCapacity, double fuelConsume, int fuelOption){
        super(basePrice, brand, model, cylinderCapacity, klm, ownershipCard, plate, statusOption, theSoat, theTecnomechanics, doorsNumber, polarization, cartype);
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

    public String toString(){
        return super.toString() + "\n" +
        "Capacidad de gasolina: " + fuelCapacity + "\n" +
        "Consumo de gasolina: " + fuelConsume + "\n" +
        "Tipo de gasolina: " + fuelType + "\n";
    }
}
