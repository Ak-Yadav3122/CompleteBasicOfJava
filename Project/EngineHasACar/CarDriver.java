package EngineHasACar;

public class CarDriver {
    public static void main(String[] args) {
        Car c1 = new Car("BMW",5000000,"Red" );
        c1.CarName();
        c1.CarPrice();
        c1.CarColor();
        c1.e1.displayEngine();

        System.out.println("======================By Using Aggregation car 1====================");

        Engine e2 = new Engine(43,"ajxz56",56);
        Car c2 = new Car("Tesla",542875629,"Yellow",e2);
        
        c2.CarName();
        c2.CarPrice();
        c2.CarColor();
        c2.e1.displayEngine();

        System.out.println("========================By Using Aggregation  car 2========================");
        Engine e3 = new Engine(39,"AKJSH23",76);
        Car c3 = new Car("Farari",866423965,"Green",e3);
        c3.CarName();
        c3.CarPrice();
        c3.CarColor();
        c3.e1.displayEngine();

    }
}
