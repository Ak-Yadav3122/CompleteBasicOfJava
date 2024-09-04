package Java_Basic;

import java.util.*;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your radius: ");
        float radius = sc.nextFloat();

        double circumferenceResult = getCirecumference(radius);
        System.out.println("your Circumference of Circle are: " + circumferenceResult);

        double AreaResult = getAreaResult(radius);
        System.out.println("Your area of Circle are: " + AreaResult);

        sc.close();

    }

    public static double getCirecumference(float rad) {
        double circumferenceOfCircel = 2 * rad * Math.PI;
        return circumferenceOfCircel;
    }

    public static double getAreaResult(float rad) {
        double area = Math.PI * Math.pow(rad, 2);
        return area;
    }

}
