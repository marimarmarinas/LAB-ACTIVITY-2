public class Truck extends Vehicle {

    private int numberOfWheels;

    public Truck(String brand, String model, int year, int numberOfWheels) {
        super(brand, model, year);
        this.numberOfWheels = numberOfWheels;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Wheels: " + numberOfWheels);
    }

    @Override 
    public void moveForward() {
        System.out.println("A truck moves forward.");
    }

    @Override 
    public void moveBackward() {
        System.out.println("A truck moves backwards.");
    }

    @Override 
    public void moveLeft() {
        System.out.println("A truck moves left.");
    }

    @Override 
    public void moveRight() {
        System.out.println("A truck moves right.");
    }
}