package CarHasAEngine;

public class CarDriver {
    public static void main(String[] args) {
        Car c1= new Car("TaTa", 230000);
        c1.displayCar();

        // To create new horsepower,strokes,type. we use new Engine() and pass new value.

        Car c2 = new Car("BMW",2500000, new Engine(80,8,"Desial"));
        c2.displayCar();
    }
}
