/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softprinciple2;

class Car {
    private String model;
    
    public Car(String model) {
        this.model = model;
    }
    
    public void drive() {
        System.out.println("Driving a " + model);
    }
}


class CarFactory {
    public Car createCar(String model) {
        return new Car(model);
    }
}


public class WithCreationPrinciple {
    public static void main(String[] args) {
        CarFactory factory = new CarFactory();
        Car car = factory.createCar("Toyota");
        car.drive();
    }
}