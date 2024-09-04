package Java_Basic;

import java.util.*;

public class FindOddNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int totalCount = getOddNumber(num);
        System.out.println("Your total count of odd number is: " + totalCount);
        sc.close();
    }

    public static int getOddNumber(int num) {

        int n = 1;
        int count = 0;
        int sum = 0;
        while (n <= num) {
            if (n % 2 != 0) {
                System.out.println(n+" is Odd number ");
                sum = sum + n;

                count++;
            }
            n++;
        }
        System.out.println("Hence The Total Sum Of All Odd Numbers: " + sum);
        return count;
    }
}
