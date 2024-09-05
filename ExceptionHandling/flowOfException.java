package ExceptionHandling;

import java.util.Scanner;

public class flowOfException {
    public static void main(String[] args) {
        a();
    }
    private static void a(){
        b();
    }
    private static void b(){
        c();
    }
    private static void c(){
        d();
    }
    private static void d(){

        Scanner input = new Scanner(System.in);
       
        System.out.println("Welcome to Calculator World...");

        System.out.print("Please enter your first number:");
        int a = input.nextInt();

        System.out.print("Please enter your second number:");
        int b = input.nextInt();
        
        input.close();
        try {
            int division = a / b;
            System.out.println("Your division of two number are: " + division);
        }
        catch(Throwable throwable){
            System.out.println("General exception");
            throw throwable;
        }
        finally {
            System.out.println("Completed");
        }
        
    }
    
}

