/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package One.abstractexample2;

/**
 *
 * @author Jahna Sri Aneela Ankam
 */
public abstract class Toy {

    private int quantity;
    private double price;
    private String vendorName;

    public Toy(int quantity, double price, String vendorName) {
        this.quantity = quantity;
        this.price = price;
        this.vendorName = vendorName;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getVendorName() {
        return vendorName;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Toy" + "quantity=" + quantity + ", price=" + price
                + ", vendorName=" + vendorName;
    }

    public abstract double cost();
}

class SoftToy extends Toy {

    public SoftToy(int quantity, double price, String vendorName) {
        super(quantity, price, vendorName);
    }

    @Override
    public double cost() {
        return super.getQuantity() * super.getPrice();
    }

    @Override
    public String toString() {
        return "SoftToy" + "\nThe name of the vendor is:"
                + super.getVendorName() + "\nQuantity is:" + super.getQuantity();
    }

}

class ToyDriver {

    public static void main(String[] args) {
        Toy t = new SoftToy(1, 10, "Avengers");
        System.out.println("Answer for question 1: Jahna Sri Aneela Ankam");
        System.out.println(t);
        System.out.println(t.cost());
    }
}

