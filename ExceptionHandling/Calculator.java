package ExceptionHandling;

import java.util.Scanner;

public class Calculator {  //See notes

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Calculator World...");

        System.out.print("Please enter your first number:");
        int a = input.nextInt();

        System.out.print("Please enter your second number:");
        int b = input.nextInt();

        getResult(a,b);
        input.close();
    }

    public static  void getResult (int a,int b){
        try {
            int division = a / b;
            System.out.print("Your division of two number are: " + division);
        }
        catch (ArithmeticException exception){
            System.out.println("Enter Valid Values, Your entered value is, "+ exception.getMessage());
        }
    }
}
