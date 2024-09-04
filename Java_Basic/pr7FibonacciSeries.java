package Java_Basic;
import java.util.Scanner;

public class pr7FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();
        int firstTerm = 0;
         int secondTerm = 1;
         System.out.print("Sequence of Fibonacci Series till " + n +"terms are: ");
    
        for (int i = 1; i <= n; ++i) {
          System.out.print(firstTerm + ", ");

          // compute the next term
          int nextTerm = firstTerm + secondTerm;
          firstTerm = secondTerm;
          secondTerm = nextTerm;
        }
        sc.close();
    }
}
