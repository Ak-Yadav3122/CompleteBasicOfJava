package Constructor_Chaining;
import java.util.*;
public class VechileDriver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Your car details are:");

        Vechile v1 = new Vechile();
        v1.displayCar();
        Vechile v2 = new Vechile("BMW",20000000,35);
        v2.displayCar();
        Vechile v3 = new Vechile("Maruti",700000,45);
        v3.displayCar();
        Vechile v4 = new Vechile("Thar",2500000,47);
        v4.displayCar();


        sc.close();
    }
    
}
