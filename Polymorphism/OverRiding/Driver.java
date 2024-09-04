package Polymorphism.OverRiding;

public class Driver {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        Vehicle vehicle = new Vehicle();
        vehicle.start();
        Bike bike = new Bike();
        bike.start();

    }

}
