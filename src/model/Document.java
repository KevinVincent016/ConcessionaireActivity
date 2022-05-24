package model;

public abstract class Document {
    
    private double price;
    private int year;
    private int image;

    public Document(double price, int year, int image){
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

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
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
