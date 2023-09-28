package org.sofe3650.grocery.tests;

import java.io.FileNotFoundException;

import org.sofe3650.grocery.utility.PriceReader;

public class PriceReaderTests {

    public static void main(String[] args) throws FileNotFoundException {
        PriceReader canadaPriceReader = new PriceReader("assets/canada-prices.txt");
        PriceReader mexicoPriceReader = new PriceReader("assets/mexico-prices.txt");

        if(canadaPriceReader.getToken("apple") != 5.99) {
            System.out.println("Canada apple price is incorrect");
            System.out.println("1. Test failed");
            throw new RuntimeException("Canada apple price is incorrect");
        } else {
            System.out.println("1. Test passed");
        }

        if(canadaPriceReader.getToken("laptop") != 3199.99) {
            System.out.println("Canada laptop price is incorrect");
            System.out.println("2. Test failed");
            throw new RuntimeException("Canada laptop price is incorrect");
        } else {
            System.out.println("2. Test passed");
        }

        if(mexicoPriceReader.getToken("apple") != 3.99) {
            System.out.println("Mexico apple price is incorrect");
            System.out.println("3. Test failed");
            throw new RuntimeException("Mexico apple price is incorrect");
        } else {
            System.out.println("3. Test passed");
        }

        if(mexicoPriceReader.getToken("laptop") != 1099.99) {
            System.out.println("Mexico laptop price is incorrect");
            System.out.println("4. Test failed");
            throw new RuntimeException("Mexico laptop price is incorrect");
        } else {
            System.out.println("4. Test passed");
        }
    }

    

}
