/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softprinciple2;

class Car {
    private String model; // Yeh private variable 'model' car ka naam ya model store karta hai
    
    // Constructor jo 'Car' ka object banane ke waqt model set karta hai
    public Car(String model) {
        this.model = model;
    }
    
    // Method jo car ko "drive" karne ka message print karta hai
    public void drive() {
        System.out.println("Driving a " + model); // Yeh car ka model screen par dikhata hai
    }
}

class CarFactory {
    // Method jo 'Car' ka naya object return karta hai jab model pass kiya jaye
    public Car createCar(String model) {
        return new Car(model); // Naya car object return karta hai model ke sath
    }
}

public class WithCreationPrinciple {
    public static void main(String[] args) {
        CarFactory factory = new CarFactory(); // CarFactory ka naya object banate hain
        Car car = factory.createCar("Toyota"); // CarFactory se 'Toyota' model ki car banate hain
        car.drive(); // Car ko "drive" karte hain aur message print hota hai
    }
}
