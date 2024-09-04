package ControlStatement;

import java.util.*;

public class TernaryOpertor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your First Number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter Your Second Number: ");
        int num2 = sc.nextInt();

        int result = num1 < num2 ? num2 : num1;
        System.out.println("Your Greater Number are: " + result);

        sc.close();
    }
}
