package Java_Basic;
import java.util.*;
public class MinimumOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first Number: ");
        int num1  = sc.nextInt();
        System.out.println("Enter your second Number: ");
        int num2 = sc.nextInt();

        int result = num1 < num2 ? num1:num2;
        System.out.println("Your Minimum number "+ result);
        sc.close();
    }
}
