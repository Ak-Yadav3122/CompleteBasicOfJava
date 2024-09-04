package AccessModifire;
// import EncapulationChallenge.GetterSetter.Car;
public class DriveCar {
    public static void main(String[] args) {
        Car car = new Car();
        car.color = "red";
        car.model= "Swift";
        // car.costOfCar = 23243525;  // give error because we make it private so we can not ccess it.so we make a parametrazied constructor to use it.
        System.out.println(car);
        
        Car newCar = new Car("red", "BMW", 1, 5000000);
        System.out.println(newCar);


        
        // Car myCar = new Car("red","swift",3483655);
        // System.out.println( myCar.getColor());
        // System.out.println( myCar.setColor("blue"));
        
        
    }
}
