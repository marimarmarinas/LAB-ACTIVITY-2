public class Main {
    public static void main(String[] args) {

        Vehicle c1 = new Vehicle("Toyota", "Corolla", 1995);
        Vehicle c2 = new Vehicle("Honda", "Civic", 2018);
        Vehicle c3 = new Vehicle("Ford", "Mustang", 1967);

        c1.displayInfo();
        c2.displayInfo();
        c3.displayInfo();

        System.out.println("\nVehicle 1");
        System.out.println("Age: " + c1.calculateAge());
        System.out.println("Vintage: " + c1.isVintage());

        System.out.println("\nVehicle 2");
        System.out.println("Age: " + c2.calculateAge());
        System.out.println("Vintage: " + c2.isVintage());

        System.out.println("\nVehicle 3");
        System.out.println("Age: " + c3.calculateAge());
        System.out.println("Vintage: " + c3.isVintage());

        System.out.println("\nGetters");
        System.out.println("Brand: " + c1.getBrand());
        System.out.println("Model: " + c1.getModel());
        System.out.println("Year: " + c1.getYear());

        System.out.println("\nsetYear Tests");

        System.out.println("setYear(2000): " + c1.setYear(2000));
        System.out.println("Stored year: " + c1.getYear());
        System.out.println("Age: " + c1.calculateAge());
        System.out.println("Vintage: " + c1.isVintage());

        System.out.println("\nsetYear(1885): " + c1.setYear(1885));
        System.out.println("Stored year: " + c1.getYear());

        System.out.println("\nsetYear(2027): " + c1.setYear(2027));
        System.out.println("Stored year: " + c1.getYear());

        System.out.println("\nConstructor Validation Tests");

        Vehicle invalid1 = new Vehicle("Test", "Invalid", 1885);
        System.out.println("Vehicle with year 1885: " + invalid1.getYear());

        Vehicle invalid2 = new Vehicle("Test", "Invalid", 2027);
        System.out.println("Vehicle with year 2027: " + invalid2.getYear());
    }
}