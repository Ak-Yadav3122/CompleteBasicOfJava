package AccessModifire;

public class Car {
    public String color;
    public String model;
    private double fuelLevel;
    private long costOfCar;

    public Car() {
        System.out.println("Please tell me your reference");
    }

    public Car(String color, String model, double fuelLevel, long costOfCar) {
        this.color = color;
        this.model = model;
        this.fuelLevel = fuelLevel;
        this.costOfCar = costOfCar;
    }

    @Override
    public String toString() {
        return "your car color is " + color + " and it is " + model + " model " + "It cost of purchases are "
                + costOfCar + " and its fule level is "+ fuelLevel;
    }
}
