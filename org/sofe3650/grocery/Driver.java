package org.sofe3650.grocery;

import java.io.FileNotFoundException;

import org.sofe3650.grocery.factories.CanadaProductFactory;
import org.sofe3650.grocery.factories.MexicoProductFactory;
import org.sofe3650.grocery.products.Apple;
import org.sofe3650.grocery.products.Laptop;
import org.sofe3650.grocery.utility.PriceReader;

public class Driver {
    public static void main(String[] args) throws RuntimeException, FileNotFoundException {

        PriceReader canadaPriceReader = new PriceReader("assets/canada-prices.txt");
        PriceReader mexicoPriceReader = new PriceReader("assets/mexico-prices.txt");

        double canadaApplePrice = canadaPriceReader.getToken("apple");
        double canadaLaptopPrice = canadaPriceReader.getToken("laptop");

        double mexicoApplePrice = mexicoPriceReader.getToken("apple");
        double mexicoLaptopPrice = mexicoPriceReader.getToken("laptop");

        System.out.println("\nCanada:\n\n");

        CanadaProductFactory canada = new CanadaProductFactory();
        MexicoProductFactory mexico = new MexicoProductFactory();

        Apple canadianApple = (Apple) canada.produceApple(canadaApplePrice);
        Laptop canadianLaptop = (Laptop) canada.produceLaptop(canadaLaptopPrice, 2.4);

        canadianApple.announceProductInformation();
        canadianLaptop.announceProductInformation();



        System.out.println("\nMexico:\n\n");

        Apple mexicanApple = (Apple) mexico.produceApple(mexicoApplePrice);
        Laptop mexicanLaptop = (Laptop) mexico.produceLaptop(mexicoLaptopPrice, 3.0);

        mexicanApple.announceProductInformation();
        mexicanLaptop.announceProductInformation();

        System.out.println("\n");

    }
}
