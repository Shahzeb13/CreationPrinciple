/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softprinciple2;

/**
 *
 * @author sp22-bse-073
 */
class Car2 {
    private String model;
    
    public Car2(String model) {
        this.model = model;
    }
    
    public void drive() {
        System.out.println("Driving a " + model);
    }
}

// Main class (without using Creator principle)
public class WithoutCreationPrinciple {
    public static void main(String[] args) {
        Car2 car = new Car2("Toyota");
        car.drive();
    }
}