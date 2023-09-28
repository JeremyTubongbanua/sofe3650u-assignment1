package org.sofe3650.grocery.tests;

import org.sofe3650.grocery.factories.CanadaProductFactory;
import org.sofe3650.grocery.products.Apple;
import org.sofe3650.grocery.products.Laptop;
import org.sofe3650.grocery.products.Product;

public class CanadaProductFactoryTests {
    // Test that the CanadaProductFactory produces the correct instances

    public static void main(String[] args) {
        CanadaProductFactory canada = new CanadaProductFactory();

        Product product;
        
        product = canada.produceApple(0);

        if(!(product instanceof Apple)) {
            System.out.println("1. Test failed");
            throw new RuntimeException("CanadaProductFactory did not produce an Apple");
        } else {
            System.out.println("1. Test passed");
        }

        product = canada.produceLaptop(0, 0);

        if(!(product instanceof Laptop)) {
            System.out.println("2. Test failed");
            throw new RuntimeException("CanadaProductFactory did not produce a Laptop");
        } else {
            System.out.println("2. Test passed");
        }
    }
}
