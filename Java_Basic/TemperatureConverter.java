package Java_Basic;
import java.util.*;
public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Wellcome to temperature converter");
        System.out.println("please enter your temp in F: ");
        float fahr = sc.nextFloat();
        float cel = (fahr-32) * 5 / 9; //The Fahrenheit to Celsius formula is expressed as °C = (°F - 32) × 5/9;
        System.out.println("Here is your temperature in Cellcius: "+cel);
        sc.close();
    }
}
