package org.sofe3650.grocery.factories;

import org.sofe3650.grocery.products.Product;

public abstract class ProductFactory {

    public abstract Product produceApple(double price);
    public abstract Product produceLaptop(double price, double cpuSpeed);

}
