public class Main {
 
    public static void printDetails(Vehicle vehicle) {
        vehicle.displayInfo();
    }

    public static void main(String[] args) {

        // 1. A parent reference holding a child object
        System.out.println("=== 1. Parent Reference ===");
        Vehicle vehicle = new Car("BMW", "X1 SUV", 2022, 4);
        vehicle.displayInfo();
        vehicle.moveForward();
        vehicle.moveBackward();
        vehicle.moveLeft();
        vehicle.moveRight();

        System.out.println();

        // 1.1 The same variable now refers to a Truck object
        Vehicle truck = new Truck("Volvo", "FH16", 2025, 10);
        printDetails(truck);
        truck.moveForward();
        truck.moveBackward();
        truck.moveLeft();
        truck.moveRight();

        System.out.println();

        // 1.2 The same variable now refers to a Motorcycle object
        Vehicle motorcycle = new Motorcycle("Honda", "Click 125i", 2024, "Gasoline");
        printDetails(motorcycle);
        motorcycle.moveForward();
        motorcycle.moveBackward();
        motorcycle.moveLeft();
        motorcycle.moveRight();

        System.out.println();

        // 2. One method accepts different Vehicle subclasses
        System.out.println("\n=== 2. Method Parameter ===");
        Car car = new Car("Mitsubishi", "Mirage G4", 2023, 4);
        printDetails(car);
        car.moveForward();
        car.moveBackward();
        car.moveLeft();
        car.moveRight();
        System.out.println();

        // 3. One array holds different Vehicle subclasses
        System.out.println("\n=== 3. Polymorphic Array ===");

        Vehicle[] vehicles = {
            new Car("Mitsubishi", "Mirage G4", 2023, 4),
            new Motorcycle("Honda", "Click 125i", 2024, "Gasoline"),
            new Truck("Volvo", "FH16", 2025, 10)
        };

        for (Vehicle currentVehicle : vehicles) {
            printDetails(currentVehicle);
            currentVehicle.moveForward();
            currentVehicle.moveBackward();
            currentVehicle.moveLeft();
            currentVehicle.moveRight();
            System.out.println();
        }
    }
}