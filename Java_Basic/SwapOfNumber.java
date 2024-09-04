package Java_Basic;
import java.util.Scanner;

public class SwapOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val1 = 5;
        int val2 = 8;
        System.out.println("value before swapping: " + val1);
        System.out.println("value before swapping: " + val2);
        System.out.println("you want to swap : true or false ");
        boolean decision = sc.nextBoolean();
        if (decision == true) {
            int temp = val1;
            val1 = val2;
            val2 = temp;
            System.out.println("value after swapping: " + val1);
            System.out.println("value after swapping: " + val2);
        } else {
            System.out.println("Your value is not swap...");
            System.out.println("Please write \"True\" to perform swapping...");
        }
        sc.close();

    }
}
