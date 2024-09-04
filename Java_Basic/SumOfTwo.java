package Java_Basic;
import java.util.*;
public class SumOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your firstNumber: ");
        int num1 = sc.nextInt();
        System.out.print("Enter your secondNumber: ");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        System.out.println("Hello Sir your sum is : "+sum);
        sc.close();
    }
}
