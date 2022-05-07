package model;

public class Tecnomechanics extends Document {
    
    private int gasLevels;

    public Tecnomechanics(double price, String year, int image, int gasLevels){
        super(price, year, image);
        this.gasLevels=gasLevels;
    }

    public int getGasLevels() {
        return this.gasLevels;
    }

    public void setGasLevels(int gasLevels) {
        this.gasLevels = gasLevels;
    }

    @Override
    public String toString() {
        return super.toString() + "Tecnomechanics gas levels: " + gasLevels;
    }
}
