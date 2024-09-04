package Java_Basic;
import java.util.Scanner;

public class pr8StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number:");
        int n = sc.nextInt();
        int originalNumber = n;
        int sum = 0;

        while (n > 0) {
            int rem = n % 10;
            sum += getFactorial(rem);
            n = n / 10;
        }

        if (sum == originalNumber) {
            System.out.println(originalNumber + " is a Strong Number");
        } else {
            System.out.println(originalNumber + " is not a Strong Number");
        }

        sc.close();
    }

    public static int getFactorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
