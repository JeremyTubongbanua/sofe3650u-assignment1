package org.sofe3650.grocery.utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PriceReader {

    private File file;

    public PriceReader(String filePath) {
        this.file = new File(filePath);
        if(!this.file.exists()) {
            throw new RuntimeException("File does not exist!");
        }
    }

    public double getToken(String token) throws FileNotFoundException, RuntimeException {
        Scanner scanner = new Scanner(file);
        while(scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if(line.equalsIgnoreCase(token)) {
                double price = Double.parseDouble(scanner.nextLine());
                scanner.close();
                return price;
            }
        }
        scanner.close();
        throw new RuntimeException("Could not find " + token + " price!");
    }

}
