package Java_Basic;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Number:");
        int num = sc.nextInt();
        int getSum = getDigitSum(num);
        System.out.println("Your digit Sum is: " + getSum);
        sc.close();
    }

    public static int getDigitSum(int n) {

        int sum = 0;
        while (n > 0) {
            int count = n % 10;
            sum = sum + count;
            n = n / 10;
        }
        return sum;
    }
}
