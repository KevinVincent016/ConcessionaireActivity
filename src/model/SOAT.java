package model;

public class SOAT extends Document {

    private double coverageAmount;

    public SOAT(double price, String year, int image, double coverageAmount){
        super(price, year, image);
        this.coverageAmount=coverageAmount;
    }
    
    public double getCoverageAmount() {
        return coverageAmount;
    }

    public void setCoverageAmount(double coverageAmount) {
        this.coverageAmount = coverageAmount;
    }

    @Override
    public String toString() {
        return super.toString() + "SOAT Coverage Amount: " + coverageAmount;
    }
}
