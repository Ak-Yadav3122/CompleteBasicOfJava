package FunctionalProgramming.LambdaExpression;

import java.util.Scanner;

public class LambdaTesting {
    public static void main(String[] args) {
        System.out.println("Hello Lembda");

        //Without using lenbda expression
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter your second number: ");
        int num2 = sc.nextInt();
        int sumOfTwo = sum(num1,num2);
        System.out.println("Sum of two number are: " + sumOfTwo);
        sc.close(); 

        

    }
    public static int sum(int firstNumber, int secondNumber){
        int result = firstNumber + secondNumber;
        return result;
    }
}
 