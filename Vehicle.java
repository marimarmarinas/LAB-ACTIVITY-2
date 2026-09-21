import java.util.Scanner;

  public class Vehicle {

    String brand;
    String model;
    int year;

      void displayInfo() {
        System.out.println("Brand: " + brand + "\n" +
                           "Model: " + model + "\n" +
                           "Year: " + year);
    }

      int calculateAge() {
        return 2026 - year;
    }
   
      boolean isVintage() {
        return calculateAge() > 25;
    }
}