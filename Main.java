public class Main { 
 
    public static void main(String[] args) { 
 
        Vehicle c1 = new Vehicle(); 
        c1.brand = "Toyota"; 
        c1.model = "Corolla"; 
        c1.year = 1995; 
         
         
        Vehicle c2 = new Vehicle(); 
        c2.brand = "Honda"; 
        c2.model = "Civic"; 
        c2.year = 2018; 
         
         
        Vehicle c3 = new Vehicle(); 
        c3.brand = "Ford"; 
        c3.model = "Mustang"; 
        c3.year = 1967; 
         
 
        System.out.println("Vehicle 1: \n"); 
        c1.displayInfo(); 
        System.out.println("Age: " + c1.calculateAge()); 
        System.out.println("Vintage: " + c1.isVintage()); 
 
        System.out.println(); 
 
        System.out.println("Vehicle 2: \n");
        c2.displayInfo(); 
        System.out.println("Age: " + c2.calculateAge()); 
        System.out.println("Vintage: " + c2.isVintage()); 
 
        System.out.println(); 
 
        System.out.println("Vehicle 3: \n");
        c3.displayInfo(); 
        System.out.println("Age: " + c3.calculateAge()); 
        System.out.println("Vintage: " + c3.isVintage()); 
         
    } 
}
