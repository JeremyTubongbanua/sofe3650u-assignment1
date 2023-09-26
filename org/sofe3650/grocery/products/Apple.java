package org.sofe3650.grocery.products;

public class Apple implements Product {
    
    private double price; // the price of the apple
    private String tree; // the kind of tree it came from

    public Apple(double price, String tree) {
        this.price = price;
        this.tree = tree;
    }

    @Override
    public void announceProductInformation() {
        System.out.println("Apple price is " + this.price + "! And it came from this tree: " + this.tree + "!");
    }

}
