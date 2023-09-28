package org.sofe3650.grocery;

import java.io.FileNotFoundException;

import org.sofe3650.grocery.factories.CanadaProductFactory;
import org.sofe3650.grocery.factories.MexicoProductFactory;
import org.sofe3650.grocery.factories.ProductFactory;
import org.sofe3650.grocery.products.Apple;
import org.sofe3650.grocery.products.Laptop;
import org.sofe3650.grocery.utility.PriceReader;

public class Driver {

    private static Apple produceAppleF(ProductFactory factory, double price) {
        return (Apple) factory.produceApple(price);
    }

    private static Laptop produceLaptopF(ProductFactory factory, double price, double cpuSpeed) {
        return (Laptop) factory.produceLaptop(price, cpuSpeed);
    }

    public static void main(String[] args) throws RuntimeException, FileNotFoundException {

        PriceReader canadaPriceReader = new PriceReader("assets/canada-prices.txt");
        PriceReader mexicoPriceReader = new PriceReader("assets/mexico-prices.txt");

        double canadaApplePrice = canadaPriceReader.getToken("apple");
        double canadaLaptopPrice = canadaPriceReader.getToken("laptop");

        double mexicoApplePrice = mexicoPriceReader.getToken("apple");
        double mexicoLaptopPrice = mexicoPriceReader.getToken("laptop");

        System.out.println("\nCanada:\n\n");

        ProductFactory canada = new CanadaProductFactory();
        ProductFactory mexico = new MexicoProductFactory();

        Apple canadianApple = produceAppleF(canada, canadaApplePrice);
        Laptop canadianLaptop = produceLaptopF(canada, canadaLaptopPrice, 2.4);

        canadianApple.announceProductInformation();
        canadianLaptop.announceProductInformation();

        System.out.println("\nMexico:\n\n");

        Apple mexicanApple = produceAppleF(mexico, mexicoApplePrice);
        Laptop mexicanLaptop = produceLaptopF(mexico, mexicoLaptopPrice, 3.5);

        mexicanApple.announceProductInformation();
        mexicanLaptop.announceProductInformation();

        System.out.println("\n");

    }
}
