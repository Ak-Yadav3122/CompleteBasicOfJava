package Java_Basic;

import java.util.Scanner;

public class LCMOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your First Number:");
        int firstNum = sc.nextInt();
        System.out.print("Enter your Second Number:");
        int secondNum = sc.nextInt();
        getLCMOfNumber(firstNum, secondNum);
        sc.close();
    }

    public static void getLCMOfNumber(int num1, int num2) {
        int num = 1;
        while (num <= num2) {
            int factor = num1 * num;
            if (factor % num2 == 0) {
                System.out.println("Your LCM of two number are: " + factor);
                break;
            } else {
                num++;
            }

        }

    }
}
