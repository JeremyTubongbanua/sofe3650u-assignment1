package org.sofe3650.grocery.tests;

import org.sofe3650.grocery.factories.MexicoProductFactory;
import org.sofe3650.grocery.products.Apple;
import org.sofe3650.grocery.products.Laptop;
import org.sofe3650.grocery.products.Product;

public class MexicoProductFactoryTests {
    
    public static void main(String[] args) {
        // Test that the MexicoProductFactory produces the correct instances
        MexicoProductFactory mexico = new MexicoProductFactory();

        Product product;

        product = mexico.produceApple(0);
        if(!(product instanceof Apple)) {
            System.out.println("1. Test failed");
            throw new RuntimeException("MexicoProductFactory did not produce an Apple");
        } else {
            System.out.println("1. Test passed");
        }

        product = mexico.produceLaptop(0, 0);
        if(!(product instanceof Laptop)) {
            System.out.println("2. Test failed");
            throw new RuntimeException("MexicoProductFactory did not produce a Laptop");
        } else {
            System.out.println("2. Test passed");
        }
    }

}
