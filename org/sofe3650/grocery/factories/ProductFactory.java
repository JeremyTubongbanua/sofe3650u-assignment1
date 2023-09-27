package org.sofe3650.grocery.factories;

import org.sofe3650.grocery.products.Product;

public interface ProductFactory {

    public Product produceApple(double price);
    public Product produceLaptop(double price, double cpuSpeed);

}
