package org.sofe3650.grocery.factories;

import org.sofe3650.grocery.products.Apple;
import org.sofe3650.grocery.products.Laptop;
import org.sofe3650.grocery.products.Product;

public class MexicoProductFactory extends ProductFactory {

    @Override
    public Product produceApple(double price) {
        return new Apple(price, "Mexican Tree");
    }

    @Override
    public Product produceLaptop(double price, double cpuSpeed) {
        return new Laptop(price, cpuSpeed, "Mexico");
    }
    
}
