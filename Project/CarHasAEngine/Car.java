package CarHasAEngine;

public class Car {
    String name;
    double price;

    Engine e1 = new Engine(60, 8, "Petrol", 45);

    Car() {

    }

    Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // To create new engine .
    Car(String name, double price, Engine e1) {
        this.name = name;
        this.price = price;
        this.e1 = e1;
    }

    public void displayCar() {
        System.out.println("Car name is: " + name);
        System.out.println("car price is: " + price);
        e1.displayEngine();

    }
}
