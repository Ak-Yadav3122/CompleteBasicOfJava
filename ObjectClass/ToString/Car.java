package ObjectClass.ToString;

public class Car {
    String carName;
    int noOfWheel;
    String color;
    long price;
    double maxSpeed;

    public Car(String carName, int noOfWheel, String color, long price, double maxSpeed) {
        this.carName = carName;
        this.noOfWheel = noOfWheel;
        this.color = color;
        this.price = price;
        this.maxSpeed = maxSpeed;
    }

    /*
        definition of toString.
        If we not make this method then we find classname@unique hash code of
        object and if we want to find the valid output then use use this //definition
       of toString.
        
     */

    @Override
    public String toString() {
        return "MY car name is: " + carName;
    }

    public static void main(String[] args) {
        Car c1 = new Car("swift", 4, "red", 4000000, 45.5);
        System.out.println(c1);// this toString() method by default found in each class.Its your choice you
                               // write or not
    }

}