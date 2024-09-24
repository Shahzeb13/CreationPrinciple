package softprinciple2;

/**
 *
 * @author sp22-bse-073
 */
class Car2 {
    private String model; // 'model' variable mein car ka naam ya model store kiya jata hai
    
    // Constructor jo object banate waqt car ka model set karta hai
    public Car2(String model) {
        this.model = model;
    }
    
    // Method jo car ko "drive" karte waqt message print karta hai
    public void drive() {
        System.out.println("Driving a " + model); // Yeh car ka model output karta hai
    }
}

// Main class (yahaan creator principle use nahi kiya gaya)
public class WithoutCreationPrinciple {
    public static void main(String[] args) {
        // Direct Car2 object banate hain bina factory ke
        Car2 car = new Car2("Toyota"); // Car ka object manually create kiya gaya
        car.drive(); // Car ko "drive" karte hain aur output dikhate hain
    }
}
