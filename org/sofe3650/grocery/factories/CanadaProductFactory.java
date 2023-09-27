package org.sofe3650.grocery.factories;

import org.sofe3650.grocery.products.Apple;
import org.sofe3650.grocery.products.Laptop;
import org.sofe3650.grocery.products.Product;

public class CanadaProductFactory implements ProductFactory {

    @Override
    public Product produceApple(double price) {
        return new Apple(price, "Maple");
    }

    @Override
    public Product produceLaptop(double price, double cpuSpeed ) {
        return new Laptop(price, cpuSpeed, "Canada");
    }

}
