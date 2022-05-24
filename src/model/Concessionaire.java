package model;
import java.util.ArrayList;
import java.util.Calendar;

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

    public String registerGasCar(double basePrice, String brand, int model, int cylinderCapacity, int klm, double owPrice, int owYear, int owImage, String plate, int statusOption, double soPrice, int soYear, int soImage, double soCoverageAmount, double tePrice, int teYear, int teImage, int teGasLevels, int doorsNumber, boolean polarization, int cartype, double fuelCapacity, int fuelOption){
        String out = "";
        OwnershipCard theOwnershipCard = new OwnershipCard(owPrice, owYear, owImage);
        if(owPrice==0 && owYear==0 && owImage==0){
            theOwnershipCard = null;
        }
        SOAT theSoat = new SOAT(soPrice, soYear, soImage, soCoverageAmount);
        if(soPrice==0 && soYear==0 && soImage==0){
            theSoat = null;
        }
        Tecnomechanics theTecnomechanics = new Tecnomechanics(tePrice, teYear, teImage, teGasLevels);
        if(tePrice==0 && teYear==0 && teImage==0){
            theTecnomechanics = null;
        }
        GasolineCar theGCar = new GasolineCar(basePrice, brand, model, cylinderCapacity, klm, theOwnershipCard, plate, statusOption, theSoat, theTecnomechanics, doorsNumber, polarization, cartype, fuelCapacity, fuelOption);
        theVehicles.add(theGCar);
        out = "Carro de modelo " + model + " de la marca " + brand + " registrado" + "\n Enter para continuar";
        return out;
    }

    public String registerElectricCar(double basePrice, String brand, int model, int cylinderCapacity, int klm, double owPrice, int owYear, int owImage, String plate, int statusOption, double soPrice, int soYear, int soImage, double soCoverageAmount, double tePrice, int teYear, int teImage, int teGasLevels, int doorsNumber, boolean polarization, int cartype, double batteryDuration, int chargerOption){
        String out = "";
        OwnershipCard theOwnershipCard = new OwnershipCard(owPrice, owYear, owImage);
        if(owPrice==0 && owYear==0 && owImage==0){
            theOwnershipCard = null;
        }
        SOAT theSoat = new SOAT(soPrice, soYear, soImage, soCoverageAmount);
        if(soPrice==0 && soYear==0 && soImage==0){
            theSoat = null;
        }
        Tecnomechanics theTecnomechanics = new Tecnomechanics(tePrice, teYear, teImage, teGasLevels);
        if(tePrice==0 && teYear==0 && teImage==0){
            theTecnomechanics = null;
        }
        ElectricCar theECar = new ElectricCar(basePrice, brand, model, cylinderCapacity, klm, theOwnershipCard, plate, statusOption, theSoat, theTecnomechanics, doorsNumber, polarization, cartype, batteryDuration, chargerOption);
        theVehicles.add(theECar);
        out = "Carro de modelo " + model + " de la marca " + brand + " registrado" + "\n Enter para continuar";
        return out;
    }

    public String registerHybridCar(double basePrice, String brand, int model, int cylinderCapacity, int klm, double owPrice, int owYear, int owImage, String plate, int statusOption, double soPrice, int soYear, int soImage, double soCoverageAmount, double tePrice, int teYear, int teImage, int teGasLevels, int doorsNumber, boolean polarization, int cartype, double fuelCapacity, int fuelOption, double batteryDuration, int chargerOption){
        String out = "";
        OwnershipCard theOwnershipCard = new OwnershipCard(owPrice, owYear, owImage);
        if(owPrice==0 && owYear==0 && owImage==0){
            theOwnershipCard = null;
        }
        SOAT theSoat = new SOAT(soPrice, soYear, soImage, soCoverageAmount);
        if(soPrice==0 && soYear==0 && soImage==0){
            theSoat = null;
        }
        Tecnomechanics theTecnomechanics = new Tecnomechanics(tePrice, teYear, teImage, teGasLevels);
        if(tePrice==0 && teYear==0 && teImage==0){
            theTecnomechanics = null;
        }
        HybridCar theHCar = new HybridCar(basePrice, brand, model, cylinderCapacity, klm, theOwnershipCard, plate, statusOption, theSoat, theTecnomechanics, doorsNumber, polarization, cartype, fuelCapacity, fuelOption, batteryDuration, chargerOption);
        theVehicles.add(theHCar);
        out = "Carro de modelo " + model + " de la marca " + brand + " registrado" + "\n Enter para continuar";
        return out;
    }

    public String registerMotorcycle(double basePrice, String brand, int model, int cylinderCapacity, int klm, double owPrice, int owYear, int owImage, String plate, int statusOption, double soPrice, int soYear, int soImage, double soCoverageAmount, double tePrice, int teYear, int teImage, int teGasLevels, double fuelCapacity, int motoOption){
        String out = "";
        OwnershipCard theOwnershipCard = new OwnershipCard(owPrice, owYear, owImage);
        if(owPrice==0 && owYear==0 && owImage==0){
            theOwnershipCard = null;
        }
        SOAT theSoat = new SOAT(soPrice, soYear, soImage, soCoverageAmount);
        if(soPrice==0 && soYear==0 && soImage==0 && soCoverageAmount==0){
            theSoat = null;
        }
        Tecnomechanics theTecnomechanics = new Tecnomechanics(tePrice, teYear, teImage, teGasLevels);
        if(tePrice==0 && teYear==0 && teImage==0 && teGasLevels==0){
            theTecnomechanics = null;
        }
        Motorcycle theMoto = new Motorcycle(basePrice, brand, model, cylinderCapacity, klm, theOwnershipCard, plate, statusOption, theSoat, theTecnomechanics, fuelCapacity, motoOption);
        theVehicles.add(theMoto);
        out = "Moto de modelo " + model + " de la marca " + brand + " registrado" + "\n Enter para continuar";
        return out;
    }

    public String calculateSellPrice(String plate){
        String out = "";
        Calendar calendar = Calendar.getInstance();
        int actualYear = calendar.get(Calendar.YEAR);

        for(int i=0;i<theVehicles.size() && theVehicles.get(i)!=null;i++){
            if(theVehicles.get(i).getPlate().equalsIgnoreCase(plate)){
                double newBasePrice = theVehicles.get(i).getBasePrice();
                if(theVehicles.get(i).existDoc()==false){
                    newBasePrice += 500000;
                }else{
                    if(theVehicles.get(i).getSoatDate()<actualYear || theVehicles.get(i).getTecDate()<actualYear){
                        newBasePrice += 500000;
                    }
                }
                if(theVehicles.get(i) instanceof ElectricCar){
                    double aux = theVehicles.get(i).getBasePrice()*20/100;
                    newBasePrice += aux;
                    if(theVehicles.get(i).getTheStatus()==Status.USADO){
                        double aux2 = newBasePrice*10/100;
                        newBasePrice -= aux2;
                    }
                }
                if(theVehicles.get(i) instanceof HybridCar){
                    double aux = theVehicles.get(i).getBasePrice()*15/100;
                    newBasePrice += aux;
                    if(theVehicles.get(i).getTheStatus()==Status.USADO){
                        double aux2 = newBasePrice*10/100;
                        newBasePrice -= aux2;
                    }
                }
                if(theVehicles.get(i) instanceof GasolineCar){
                    if(theVehicles.get(i).getTheStatus()==Status.USADO){
                        double aux = newBasePrice*10/100;
                        newBasePrice -= aux;
                    }
                }
                if(theVehicles.get(i) instanceof Motorcycle){
                    double aux = theVehicles.get(i).getBasePrice()*4/100;
                    newBasePrice += aux;
                    if(theVehicles.get(i).getTheStatus()==Status.USADO){
                        double aux2 = newBasePrice*2/100;
                        newBasePrice -= aux2;
                    }
                }
                theVehicles.get(i).setSellPrice(newBasePrice);
                out = "Precio del vehiculo con placa " + plate + " actualizado: " + "\nPrecio base: " + theVehicles.get(i).getBasePrice() + "\nPrecio de venta: " + newBasePrice + "\n";
            }else{
                out = "Vehiculo con placa " + plate + " no fue encontrado";
            }
        }
        return out;
    }

    public String generateInfo(int answer){
        String out = "";
        switch(answer){
            case 1:
            for(int i=0;i<theVehicles.size();i++){
                if(theVehicles.get(i) instanceof GasolineCar){
                    out += "\nCarro de gasolina #" + (i+1) + "\n" +
                    theVehicles.get(i).toString();
                }
            }
            for(int j=0;j<theVehicles.size();j++){
                if(theVehicles.get(j) instanceof ElectricCar){
                    out += "\nCarro electrico #" + (j+1) + "\n" +
                    theVehicles.get(j).toString();
                }
            }
            for(int k=0;k<theVehicles.size();k++){
                if(theVehicles.get(k) instanceof HybridCar){
                    out += "\nCarro hybrido #" + (k+1) + "\n" +
                    theVehicles.get(k).toString();
                }
            }
            for(int l=0;l<theVehicles.size();l++){
                if(theVehicles.get(l) instanceof Motorcycle){
                    out += "\nMotocicleta #" + (l+1) + "\n" +
                    theVehicles.get(l).toString();
                }
            }
            break;

            case 2:
            for(int i=0;i<theVehicles.size();i++){
                if(theVehicles.get(i) instanceof GasolineCar){
                    GasolineCar theV = (GasolineCar)theVehicles.get(i);
                    if(theV.getFuelType()==FuelType.CORRIENTE){
                        out += "\nGasolina Corriente:\n" + "Carro #" + i + "\n" + 
                        theV.toString();
                    }
                }
            }
            for(int j=0;j<theVehicles.size();j++){
                if(theVehicles.get(j) instanceof GasolineCar){
                    GasolineCar theV = (GasolineCar)theVehicles.get(j);
                    if(theV.getFuelType()==FuelType.DIESEL){
                        out += "\nGasolina Diesel:\n" + "Carro #" + j + "\n" + 
                        theV.toString();
                    }
                }
            }
            for(int k=0;k<theVehicles.size();k++){
                if(theVehicles.get(k) instanceof GasolineCar){
                    GasolineCar theV = (GasolineCar)theVehicles.get(k);
                    if(theV.getFuelType()==FuelType.EXTRA){
                        out += "\nGasolina Extra:\n" + "Carro #" + k + "\n" + 
                        theV.toString();
                    }
                }
            }
            for(int z=0;z<theVehicles.size();z++){
                if(theVehicles.get(z) instanceof ElectricCar){
                    ElectricCar theVE = (ElectricCar)theVehicles.get(z);
                    out += "\nCombustible Electrico:\n" + "Carro #" + (z+1) + "\n" +
                    theVE.toString();
                }
            }
            for(int x=0;x<theVehicles.size();x++){
                if(theVehicles.get(x) instanceof HybridCar){
                    HybridCar theVH = (HybridCar)theVehicles.get(x);
                    out += "\nCombustible Electrico:\n" + "Carro #" + (x+1) + "\n" +
                    theVH.toString();
                }
            }
            break;

            case 3:
            for(int i=0;i<theVehicles.size();i++){
                if(theVehicles.get(i).getTheStatus()==Status.NUEVO){
                    out += "\nVehiculo nuevo #" + (i+1) + "\n" + 
                    theVehicles.get(i).toString();
                }
            }
            for(int k=0;k<theVehicles.size();k++){
                if(theVehicles.get(k).getTheStatus()==Status.USADO){
                    out += "\nVehiculo nuevo #" + (k+1) + "\n" + 
                    theVehicles.get(k).toString();
                }
            }
        }
        return out;
    }

    public String tostrings(){
        String out = "";
        for(int i=0;i<theVehicles.size();i++){
            out += theVehicles.get(i).toString();
        }
        return out;
    }
}
