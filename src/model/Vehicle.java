package model;
import java.util.ArrayList;

public abstract class Vehicle {
    
    private double basePrice;
    private double sellPrice;
    private String brand;
    private String model;
    private int cylinderCapacity;
    private int klm;
    private OwnershipCard ownershipCard;
    private String plate;
    private Status theStatus;
    private SOAT theSoat;
    private Tecnomechanics theTecnomechanics;
    private ArrayList <Vehicle> theVehicles;

    public Vehicle(double basePrice, String brand, String model, int cylinderCapacity, int klm, OwnershipCard ownershipCard, String plate, int statusOption, SOAT theSoat, Tecnomechanics theTecnomechanics){
        this.basePrice=basePrice;
        this.brand=brand;
        this.model=model;
        this.cylinderCapacity=cylinderCapacity;
        this.klm=klm;
        this.ownershipCard=ownershipCard;
        this.plate=plate;
        theStatus=null;
        if(statusOption==1){
            theStatus=theStatus.NUEVO;
        }else if(statusOption==2){
            theStatus=theStatus.USADO;
        }
        this.theSoat = theSoat;
        this.theTecnomechanics = theTecnomechanics;
        theVehicles = new ArrayList<>();
    }

    public double getBasePrice() {
        return this.basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public double getSellPrice() {
        return this.sellPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCylinderCapacity() {
        return this.cylinderCapacity;
    }

    public void setCylinderCapacity(int cylinderCapacity) {
        this.cylinderCapacity = cylinderCapacity;
    }

    public String getPlate() {
        return this.plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public int getKlm() {
        return this.klm;
    }

    public void setKlm(int klm) {
        this.klm = klm;
    }

    public Status getTheStatus() {
        return this.theStatus;
    }

    public void setTheStatus(Status theStatus) {
        this.theStatus = theStatus;
    }

    public String registerGasCar(double basePrice, String brand, String model, int cylinderCapacity, int klm, OwnershipCard ownershipCard, String plate, int statusOption, SOAT theSoat, Tecnomechanics theTecnomechanics, int doorsNumber, boolean polarization, int cartype, double fuelCapacity, double fuelConsume, int fuelOption){
        String out = "";
        GasolineCar theCar = new GasolineCar(basePrice, brand, model, cylinderCapacity, klm, ownershipCard, plate, statusOption, theSoat, theTecnomechanics, doorsNumber, polarization, cartype, fuelCapacity, fuelConsume, fuelOption);
        theVehicles.add(theCar);
        out = "Carro " + model + " de la marca " + brand + " registrado";
        return out;
    }

}
