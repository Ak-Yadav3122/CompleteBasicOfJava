package EncapulationChallenge.GetterSetter;

public class Car {

    private String color;
    private String model;
    private long priceOfCar;


    public Car(String color, String model, long priceOfCar) {
        this.color = color;
        this.model = model;
        this.priceOfCar = priceOfCar;
    }

    // design method as a public because If we use public then we call get method from any class by importing this package i.e;import EncapulationChallenge.GetterSetter.Car

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public long getPrice() {
        return priceOfCar;
    }


    // for design set method we use access modifire that tell who can access and set the color

     String setColor(String color) {
        return this.color = color;
    }

     String setModel(String model) {
        return this.model = model;
    }

     long setPrice(long priceOfCar) {
        return this.priceOfCar = priceOfCar;
    }

    @Override
    public String toString() {
        return "Car color is " + color + " and model are " + model + " and Its price are " + priceOfCar;
    }

}
