package model;

public class HybridCar extends Car implements BatteryConsumption,FuelConsumption{
    
    private double fuelCapacity;
    private double fuelConsume;
    private double batteryDuration;
    private double batteryConsume;
    private FuelType hybridFuelType;
    private ChargerType hybridChargerType;

    public HybridCar(double basePrice, String brand, int model, int cylinderCapacity, int  klm, OwnershipCard ownershipCard, String plate, int statusOption, SOAT theSoat, Tecnomechanics theTecnomechanics, int doorsNumber, boolean polarization, int cartype, double fuelCapacity, int fuelOption, double batteryDuration, int chargerOption){
        super(basePrice, brand, model, cylinderCapacity, klm, ownershipCard, plate, statusOption, theSoat, theTecnomechanics, doorsNumber, polarization, cartype);
        this.fuelCapacity=fuelCapacity;
        this.fuelConsume=calculateFuelConsume();
        this.batteryConsume=calculateBatteryConsume();
        this.batteryDuration=batteryDuration;
        switch(fuelOption){
            case 1:
            hybridFuelType = FuelType.EXTRA;
            break;
            case 2:
            hybridFuelType = FuelType.CORRIENTE;
            break;
            case 3:
            hybridFuelType = FuelType.DIESEL;
            break;
        }
        if(chargerOption==1){
            hybridChargerType = ChargerType.NORMAL;
        }else if(chargerOption==2){
            hybridChargerType = ChargerType.RAPIDO;
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

    public double getBatteryDuration() {
        return this.batteryDuration;
    }

    public void setBatteryDuration(double batteryDuration) {
        this.batteryDuration = batteryDuration;
    }

    public double getBatteryConsume() {
        return this.batteryConsume;
    }

    public void setBatteryConsume(double batteryConsume) {
        this.batteryConsume = batteryConsume;
    }

    public FuelType getHybridFuelType() {
        return this.hybridFuelType;
    }

    public void setHybridFuelType(FuelType hybridFuelType) {
        this.hybridFuelType = hybridFuelType;
    }

    public ChargerType getHybridChargerType() {
        return this.hybridChargerType;
    }

    public void setHybridChargerType(ChargerType hybridChargerType) {
        this.hybridChargerType = hybridChargerType;
    }

    public double calculateBatteryConsume(){
        double consume = 0.0;
        if(hybridChargerType==ChargerType.RAPIDO){
            consume = batteryDuration*(super.getCylinderCapacity()/200);
        }else if(hybridChargerType==ChargerType.NORMAL){
            consume = (batteryDuration + 7)*(super.getCylinderCapacity()/200);
        }
        return consume;
    }

    public double calculateFuelConsume(){
        double consume = fuelCapacity*(super.getCylinderCapacity()/180);
        return consume;
    }

    public String toString(){
        return super.toString() + "\n" +
        "Capacidad de gasolina: " + fuelCapacity + "\n" +
        "Consumo de gasolina: " + fuelConsume + "\n" +
        "Tipo de gasolina: " + hybridFuelType + "\n" +
        "Duracion de bateria: " + batteryDuration + "\n" +
        "Consumo de bateria: " + batteryConsume + "\n" +
        "Tipo de cargador: " + hybridChargerType + "\n";
    }
}
