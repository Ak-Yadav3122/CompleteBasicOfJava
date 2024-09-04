package Abstraction;

public class Car extends Vehicle{

    private int noOfDoors;

    public Car() {
        super(4); //super keyword are used to call the parent constructor.
    }

    @Override
    public void makeSound() {  //implementation of functionality which are defined in Vehicle.
       System.out.println("Hoooooooo");
    }
}
