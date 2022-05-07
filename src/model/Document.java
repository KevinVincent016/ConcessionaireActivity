package model;

public abstract class Document {
    
    private double price;
    private String year;
    private int image;

    public Document(double price, String year, int image){
        this.price=price;
        this.year=year;
        this.image=image;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getYear() {
        return this.year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getImage() {
        return this.image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String toString() {
        return "\nprice: " + price +
        "\nyear: " + year +
        "\nimage: " + image + "\n";
    }
}
