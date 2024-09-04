package Abstraction;

public class TestCar {
    public static void main(String[] args) {
       // Vehicle vehicle = new Vehicle(2); //Here we access the vehicle class so to avoid this we use abstract in Vehicle class
        Car swift = new Car();
        swift.commute(); //here we use commute() method by the help of inheritance.
        swift.makeSound();
    }
}
