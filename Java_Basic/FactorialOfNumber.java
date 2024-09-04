package Java_Basic;

import java.util.*;

public class FactorialOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Number: ");
        int num = sc.nextInt();
        long result = getFactorial(num);
        System.out.println("Your FactorialNumber are: " + result);
        sc.close();
    }

    public static int getFactorial(int value) {
        System.out.println("Function called for :"+value);
        if (value == 1) {
            return 1;
        }
        return value * getFactorial(value - 1); // Here we use recursion,
    }
}
