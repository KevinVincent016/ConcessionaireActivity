package model;

public class ElectricCar extends Car implements BatteryConsumption{
    
    private double batteryDuration;
    private double batteryConsume;
    private ChargerType chargerType;

    public ElectricCar(double basePrice, String brand, String model, int cylinderCapacity, int klm, OwnershipCard ownershipCard, String plate, int statusOption, SOAT theSoat, Tecnomechanics theTecnomechanics, int doorsNumber, boolean polarization, int cartype, double batteryDuration, double batteryConsume, int chargerOption){
        super(basePrice, brand, model, cylinderCapacity, klm, ownershipCard, plate, statusOption, theSoat, theTecnomechanics, doorsNumber, polarization, cartype);
        this.batteryDuration = batteryDuration;
        this.batteryConsume = batteryConsume;
        chargerType = null;
        if(chargerOption==1){
            chargerType = ChargerType.NORMAL;
        }else if(chargerOption==2){
            chargerType = ChargerType.RAPIDO;
        }
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

    public ChargerType getChargerType() {
        return this.chargerType;
    }

    public void setChargerType(ChargerType chargerType) {
        this.chargerType = chargerType;
    }

    public double calculateBatteryConsume(){
        double consume = 0.0;
        return consume;
    }
}
