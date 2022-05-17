package model;
import java.util.ArrayList;

public class Concessionaire {
    
    private String name;
    private ArrayList <Vehicle> theVehicles;

    public Concessionaire(String name){
        this.name=name;
        theVehicles = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String registerGasCar(double basePrice, String brand, int model, int cylinderCapacity, int klm, double owPrice, String owYear, int owImage, String plate, int statusOption, double soPrice, String soYear, int soImage, double soCoverageAmount, double tePrice, String teYear, int teImage, int teGasLevels, int doorsNumber, boolean polarization, int cartype, double fuelCapacity, double fuelConsume, int fuelOption){
        String out = "";
        OwnershipCard theOwnershipCard = new OwnershipCard(owPrice, owYear, owImage);
        if(owPrice==0 && owYear.equals("0") && owImage==0){
            theOwnershipCard = null;
        }
        SOAT theSoat = new SOAT(soPrice, soYear, soImage, soCoverageAmount);
        if(soPrice==0 && soYear.equals("0") && soImage==0){
            theSoat = null;
        }
        Tecnomechanics theTecnomechanics = new Tecnomechanics(tePrice, teYear, teImage, teGasLevels);
        if(tePrice==0 && teYear.equals("0") && teImage==0){
            theTecnomechanics = null;
        }
        GasolineCar theGCar = new GasolineCar(basePrice, brand, model, cylinderCapacity, klm, theOwnershipCard, plate, statusOption, theSoat, theTecnomechanics, doorsNumber, polarization, cartype, fuelCapacity, fuelConsume, fuelOption);
        theVehicles.add(theGCar);
        out = "Carro de modelo " + model + " de la marca " + brand + " registrado";
        return out;
    }

    public String registerElectricCar(double basePrice, String brand, int model, int cylinderCapacity, int klm, double owPrice, String owYear, int owImage, String plate, int statusOption, double soPrice, String soYear, int soImage, double soCoverageAmount, double tePrice, String teYear, int teImage, int teGasLevels, int doorsNumber, boolean polarization, int cartype, double batteryDuration, double batteryConsume, int chargerOption){
        String out = "";
        OwnershipCard theOwnershipCard = new OwnershipCard(owPrice, owYear, owImage);
        if(owPrice==0 && owYear.equals("0") && owImage==0){
            theOwnershipCard = null;
        }
        SOAT theSoat = new SOAT(soPrice, soYear, soImage, soCoverageAmount);
        if(soPrice==0 && soYear.equals("0") && soImage==0){
            theSoat = null;
        }
        Tecnomechanics theTecnomechanics = new Tecnomechanics(tePrice, teYear, teImage, teGasLevels);
        if(tePrice==0 && teYear.equals("0") && teImage==0){
            theTecnomechanics = null;
        }
        ElectricCar theECar = new ElectricCar(basePrice, brand, model, cylinderCapacity, klm, theOwnershipCard, plate, statusOption, theSoat, theTecnomechanics, doorsNumber, polarization, cartype, batteryDuration, batteryConsume, chargerOption);
        theVehicles.add(theECar);
        out = "Carro de modelo " + model + " de la marca " + brand + " registrado";
        return out;
    }

    public String registerHybridCar(double basePrice, String brand, int model, int cylinderCapacity, int klm, double owPrice, String owYear, int owImage, String plate, int statusOption, double soPrice, String soYear, int soImage, double soCoverageAmount, double tePrice, String teYear, int teImage, int teGasLevels, int doorsNumber, boolean polarization, int cartype, double fuelCapacity, double fuelConsume, int fuelOption, double batteryDuration, double batteryConsume, int chargerOption){
        String out = "";
        OwnershipCard theOwnershipCard = new OwnershipCard(owPrice, owYear, owImage);
        if(owPrice==0 && owYear.equals("0") && owImage==0){
            theOwnershipCard = null;
        }
        SOAT theSoat = new SOAT(soPrice, soYear, soImage, soCoverageAmount);
        if(soPrice==0 && soYear.equals("0") && soImage==0){
            theSoat = null;
        }
        Tecnomechanics theTecnomechanics = new Tecnomechanics(tePrice, teYear, teImage, teGasLevels);
        if(tePrice==0 && teYear.equals("0") && teImage==0){
            theTecnomechanics = null;
        }
        HybridCar theHCar = new HybridCar(basePrice, brand, model, cylinderCapacity, klm, theOwnershipCard, plate, statusOption, theSoat, theTecnomechanics, doorsNumber, polarization, cartype, fuelCapacity, fuelConsume, fuelOption, batteryDuration, batteryConsume, chargerOption);
        theVehicles.add(theHCar);
        out = "Carro de modelo " + model + " de la marca " + brand + " registrado";
        return out;
    }
}
