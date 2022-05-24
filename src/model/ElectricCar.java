package model;

public class ElectricCar extends Car implements BatteryConsumption{
    
    private double batteryDuration;
    private double batteryConsume;
    private ChargerType chargerType;

    public ElectricCar(double basePrice, String brand, int model, int cylinderCapacity, int klm, OwnershipCard ownershipCard, String plate, int statusOption, SOAT theSoat, Tecnomechanics theTecnomechanics, int doorsNumber, boolean polarization, int cartype, double batteryDuration, int chargerOption){
        super(basePrice, brand, model, cylinderCapacity, klm, ownershipCard, plate, statusOption, theSoat, theTecnomechanics, doorsNumber, polarization, cartype);
        this.batteryDuration = batteryDuration;
        this.batteryConsume = calculateBatteryConsume();
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
        if(chargerType==ChargerType.RAPIDO){
            consume = (batteryDuration + 13)*(super.getCylinderCapacity()/100);
        }else if(chargerType==ChargerType.NORMAL){
            consume = (batteryDuration + 18)*(super.getCylinderCapacity()/100);
        }
        return consume;
    }

    public String toString(){
        return super.toString() + "\n" +
        "Duracion de bateria: " + batteryDuration + "\n" +
        "Consumo de bateria: " + batteryConsume + "\n" +
        "Tipo de cargador: " + chargerType + "\n";
    }
}
