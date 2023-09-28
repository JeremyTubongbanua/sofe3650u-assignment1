#!/bin/bash
set -eu
javac org/sofe3650/grocery/tests/PriceReaderTests.java
java org.sofe3650.grocery.tests.PriceReaderTests
javac org/sofe3650/grocery/tests/CanadaProductFactoryTests.java
java org.sofe3650.grocery.tests.CanadaProductFactoryTests
javac org/sofe3650/grocery/tests/MexicoProductFactoryTests.java
java org.sofe3650.grocery.tests.MexicoProductFactoryTests