package org.sofe3650.grocery.products;

public class Laptop extends Product {

    private double cpuSpeed;
    private String location;

    public Laptop(double price, double cpuSpeed, String location) {
        this.price = price;
        this.cpuSpeed = cpuSpeed;
        this.location = location;
    }

    @Override
    public void announceProductInformation() {
        System.out.println("This is a laptop which was produced in: " + this.location + " and costs " + this.price + "!");
    }

}
