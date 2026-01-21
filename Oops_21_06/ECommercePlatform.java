package Oops_21_06;

// ECommercePlatform.java

import java.util.ArrayList;
import java.util.List;

// Abstract Product Class
abstract class Product {
    private int productId;
    private String name;
    protected double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    // Encapsulation - Getters & Setters
    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        if (price > 0)
            this.price = price;
    }

    public double getPrice() {
        return price;
    }

    // Abstract Method
    public abstract double calculateDiscount();
}

// Interface
interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

// Electronics Class
class Electronics extends Product implements Taxable {

    public Electronics(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public double calculateDiscount() {
        return price * 0.10;
    }

    @Override
    public double calculateTax() {
        return price * 0.18;
    }

    @Override
    public String getTaxDetails() {
        return "GST 18% Applied";
    }
}

// Clothing Class
class Clothing extends Product implements Taxable {

    public Clothing(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public double calculateDiscount() {
        return price * 0.20;
    }

    @Override
    public double calculateTax() {
        return price * 0.12;
    }

    @Override
    public String getTaxDetails() {
        return "GST 12% Applied";
    }
}

// Groceries Class
class Groceries extends Product {

    public Groceries(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public double calculateDiscount() {
        return price * 0.05;
    }
}

// Main Class
public class ECommercePlatform {

    // Polymorphic Method
    public static void printFinalPrice(Product p) {

        double tax = 0;

        if (p instanceof Taxable) {
            tax = ((Taxable) p).calculateTax();
        }

        double discount = p.calculateDiscount();
        double finalPrice = p.getPrice() + tax - discount;

        System.out.println("Product Name : " + p.getName());
        System.out.println("Base Price   : " + p.getPrice());
        System.out.println("Discount     : " + discount);

        if (p instanceof Taxable) {
            System.out.println("Tax          : " + tax);
            System.out.println(((Taxable) p).getTaxDetails());
        } else {
            System.out.println("Tax          : No Tax");
        }

        System.out.println("Final Price  : " + finalPrice);
        System.out.println("----------------------------------");
    }

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        products.add(new Electronics(101, "Laptop", 60000));
        products.add(new Clothing(102, "T-Shirt", 1500));
        products.add(new Groceries(103, "Rice", 800));

        for (Product p : products) {
            printFinalPrice(p);
        }
    }
}
