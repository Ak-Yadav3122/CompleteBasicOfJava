package EngineHasACar;

public class Car {
    String name;
    int price;
    String color;
    Engine e2;
    Engine e3;

    Engine e1 = new Engine(45, "SPAX23", 56);

    Car() {

    }

    Car(String name) {
        this.name = name;
    }

    Car(String name, int price) {
        this(name);
        this.price = price;
    }

    Car(String name, int price, String color) {
        this(name, price);
        this.color = color;
    }

    Car(String name, int price, String color, Engine e2) {
        this(name, price);
        this.color = color;
        this.e2 = e2;
    }

    public void CarName() {
        System.out.println("The name of Car is: " + name);
    }

    public void CarPrice() {
        System.out.println("The Price of Car is: " + price);
    }

    public void CarColor() {
        System.out.println("The Color of Car is: " + color);
    }
}
