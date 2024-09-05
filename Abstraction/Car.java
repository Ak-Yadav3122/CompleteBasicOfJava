package Abstraction;

public class Car extends Vehicle{

    public Car() {
        super(4); //super keyword are used to call the parent constructor.
    }

    @Override
    public void makeSound() {  //implementation of functionality which are defined in Vehicle.
       System.out.println("Hoooooooo");
    }
}
