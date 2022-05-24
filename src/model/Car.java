package model;

public abstract class Car extends Vehicle {
    
    private int doorsNumber;
    private boolean polarization;
    private CarType theType;
    
    public Car(double basePrice, String brand, int model, int cylinderCapacity, int klm, OwnershipCard ownershipCard, String plate, int statusOption, SOAT theSoat, Tecnomechanics theTecnomechanics, int doorsNumber, boolean polarization, int cartype){
        super(basePrice, brand, model, cylinderCapacity, klm, ownershipCard, plate, statusOption, theSoat, theTecnomechanics);
        this.doorsNumber=doorsNumber;
        this.polarization=polarization;
        theType = null;
        if(cartype == 1){
            theType = CarType.CAMIONETA;
        }else if(cartype == 2){
            theType = CarType.SEDAN;
        }
    }

    public int getDoorsNumber() {
        return this.doorsNumber;
    }

    public void setDoorsNumber(int doorsNumber) {
        this.doorsNumber = doorsNumber;
    }

    public boolean isPolarization() {
        return this.polarization;
    }

    public boolean getPolarization() {
        return this.polarization;
    }

    public void setPolarization(boolean polarization) {
        this.polarization = polarization;
    }

    public CarType getTheType() {
        return this.theType;
    }

    public void setTheType(CarType theType) {
        this.theType = theType;
    }

    public String toString(){
        return super.toString() + "\n" +
        "Numero de puertas: " + doorsNumber + "\n" +
        "Polarizacion de ventanas: " + polarization + "\n" +
        "Tipo de carro: " + theType + "\n";
    }
}
