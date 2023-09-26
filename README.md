# sofe3650u-a1

## Code Structure

The code structure is as folllows:

```
└── org/sofe3650u/grocery/
    ├── factories/
    │   ├── ProductFactory.java (abstract)
    │   ├── CanadaProductFactory.java
    │   └── MexicoProductFactory.java
    ├── products/
    │   ├── Product.java (interface)
    │   ├── Apple.java
    │   └── Laptop.java
    ├── utility/
    │   └── PriceReader.java
    └── Driver.java
```

### Products
- `Product.java (interface)` - interface that is to be implemented by more specific products (Apple and Laptop)
- `Apple.java` - class that implements `Product` and represents an apple
- `Laptop.java` - class that implements `Product` and represents a laptop

### Factories

- `ProductFactory.java (abstract)` - abstract factory class that defines abstract methods for creating objects of type `Product`
- `CanadaProductFactory.java` - concrete factory class that implements `ProductFactory` and returns objects of type `Apple` and `Laptop` with special Canadian attributes
- `MexicoProductFactory.java` - concrete factory class that implements `ProductFactory` and returns objects of type `Apple` and `Laptop` with special Mexican attributes

### Utility

- `PriceReader.java` - class that helps read the text files in the assets folder

### Driver

- `Driver.java` - class that contains the main method and runs the program

## Assets

The following text file assets are read by the program:

canada-prices.txt
```
apple
5.99
laptop
3199.99
```

mexico-prices.txt
```
apple
3.99
laptop
1099
```

## Running this Program

To run this program, ensure you are in the root of the project, where the path `assets/canada-prices.txt` and `assets/mexico-prices.txt` are valid paths. 

Run the following commands in the terminal:

```
javac org/sofe3650u/grocery/*.java
java org.sofe3650u.grocery.Driver
```

If you are on a UNIX machine, you can run the `run.sh` script by running the following command:

```
./run.sh
```

### Output Example

```sh
jeremytubongbanua@Jeremys-MacBook-Air sofe3650u-assignment1 % ./run.sh 

Canada:


Apple price is 5.99! And it came from this tree: Maple!
This is a laptop which was produced in: Canada and costs 3199.99!

Mexico:


Apple price is 3.99! And it came from this tree: Mexican Tree!
This is a laptop which was produced in: Mexico and costs 1099.0!
```

## Author

- [JeremyTubongbanua](github.com/JeremyTubongbanua)
- [Neh2332](github.com/Neh2332)
- [JerryShum](github.com/JerryShum)